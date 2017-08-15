package com.futures.Behaviour;

import com.futures.pages.BlibliHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.WaitForBuilder;

import java.util.concurrent.TimeUnit;

/**
 * Created by ADIN on 8/14/2017.
 */
public class BlibliHomePageBehaviour extends ScenarioSteps {

    BlibliHomePage blibliHome;

    @Step
    public void open() {
        getDriver().get("https://www.blibli.com");
    }

    @Step
    public void clickuserLogin(){
        blibliHome.getLoginButton().click();
        blibliHome.getPopupLpginForm().waitUntilPresent().withTimeoutOf(5, TimeUnit.SECONDS);
        blibliHome.getInputLoginEmail().type("adinatma@gmail.com");
        blibliHome.getInputLoginPassword().type("audine261196");
        blibliHome.getSubmitLoginButton().click();
    }

    @Step
    public void checkUserAlreadyLoggedIn(){
        blibliHome.getAlreadyLoginUser().isCurrentlyVisible();
    }

    @Step
    public void typeSearch(String keyword){
        blibliHome.getSearchBar().type(keyword);
    }

    @Step
    public void clickSearch(){
        blibliHome.getSearchButton().click();
    }

    @Step
    public void chooseProduct(){
        blibliHome.getProductxPath().click();
    }

    @Step
    public void closeGojekPopUp(){
        blibliHome.getGojekPopUp().click();
    }

    @Step
    public void addToCart(){
        blibliHome.getCartButton().click();
    }

    @Step
    public void checkCartPopup(){
        blibliHome.getPopupBag().isVisible();
    }

    //ke pembayaran
    @Step
    public void continueToPayment(){
        blibliHome.getcheckOutBeliSekarang().waitUntilPresent().withTimeoutOf(5, TimeUnit.SECONDS).click();
    }

    @Step
    public void continueToGreenPaymentButton(){
        blibliHome.getOtherCheckoutButton().waitUntilPresent().withTimeoutOf(5, TimeUnit.SECONDS).click();
        blibliHome.getContinueToPaymentGreenButton().click();
    }

//    @Step
//    public void chooseInternetBanking(){
//        blibliHome.getInternetBankingRadioButton().waitUntilPresent().withTimeoutOf(5, TimeUnit.SECONDS).click();
//    }

    @Step
    public void insertKlikBcaUserId(){
        blibliHome.getPaymentUserIdTextField().type("CobaSelenium");
    }

    @Step
    public void clickLastCheckOutButton(){
        blibliHome.getLastCheckOutButton().click();
        blibliHome.getThankyouSentence().waitUntilPresent().isVisible();
    }
}
