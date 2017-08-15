package com.futures.pages;

import net.serenitybdd.core.pages.PageObjects;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ADIN on 8/14/2017.
 */
public class BlibliHomePage extends PageObject {

    @FindBy(id = "gdn-login-registrasi")
    private WebElementFacade loginButton;

    @FindBy (id = "gdn-login-modal-body")
    private WebElementFacade popupLpginForm;

    @FindBy(id= "loginEmail")
    private  WebElementFacade inputLoginEmail;

    @FindBy(id = "loginPassword")
    private  WebElementFacade InputLoginPassword;

    @FindBy(id="gdn-submit-login")
    private  WebElementFacade submitLoginButton;

    @FindBy (id="gdn-already-login-label")
    private  WebElementFacade alreadyLoginUser;

    //untuk yang search
    @FindBy (name="s")
    private WebElementFacade searchBar;

    @FindBy (id ="gdn-search-button")
    private WebElementFacade searchButton;

    @FindBy (xpath = "//*[@id=\"catalogProductListContentDiv\"]/div[1]/div/a")
    private  WebElementFacade productxPath;


    @FindBy (id="gdn-add-to-cart-top")
    private  WebElementFacade cartButton;

    @FindBy (id="gdn-total-cart-label")
    private WebElementFacade totalCartLabel;

    @FindBy (id="gdn-pop-up-shopping-bag")
    private WebElementFacade popupBag;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div[4]/nav/div[2]/button")
    private WebElementFacade gojekPopUp;

    //Buat lanjutin ke pemabyaran
    @FindBy(id="gdn-buy-now-top")
    private  WebElementFacade checkOutBeliSekarang;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div[1]/div/div[1]/ul/li[3]/a")
    private WebElementFacade otherCheckoutButton;

    @FindBy(id="gdn-next-step")
    private WebElementFacade continueToPaymentGreenButton;

    @FindBy(id="gdn-payment-category-InternetBanking")
    private WebElementFacade internetBankingRadioButton;

    @FindBy(id="gdn-payment-option-KlikBCA")
    private WebElementFacade klikBcaOption;

    @FindBy(id="payment_userid")
    private  WebElementFacade paymentUserIdTextField;

    @FindBy(id="gdn-submit-checkout")
    private WebElementFacade lastCheckOutButton;

    //@FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/section/div/div/div[1]/div[1]/h1")
//    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section")
//    private WebElementFacade thankYouSentence;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/section/div/div/div[1]/div[1]/h1")
    private WebElementFacade thankyouSentence;


    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    public WebElementFacade getPopupLpginForm() {
        return popupLpginForm;
    }

    public WebElementFacade getInputLoginEmail() {
        return inputLoginEmail;
    }

    public WebElementFacade getInputLoginPassword() {
        return InputLoginPassword;
    }

    public WebElementFacade getSubmitLoginButton() {
        return submitLoginButton;
    }

    public WebElementFacade getAlreadyLoginUser() {
        return alreadyLoginUser;
    }

    //Untuk yang search dan add to cart
    public WebElementFacade getSearchBar() {
        return searchBar;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }

    public WebElementFacade getProductxPath() {
        return productxPath;
    }

    public WebElementFacade getCartButton() {
        return cartButton;
    }

    public WebElementFacade getTotalCartLabel() {
        return totalCartLabel;
    }

    public WebElementFacade getPopupBag() {
        return popupBag;
    }

    public WebElementFacade getGojekPopUp() {
        return gojekPopUp;
    }

    public WebElementFacade getContinueToPaymentGreenButton() {
        return continueToPaymentGreenButton;
    }

    public WebElementFacade getInternetBankingRadioButton() {
        return internetBankingRadioButton;
    }

    public WebElementFacade getKlikBcaOption() {
        return klikBcaOption;
    }

    public WebElementFacade getPaymentUserIdTextField() {
        return paymentUserIdTextField;
    }

    public WebElementFacade getLastCheckOutButton() {
        return lastCheckOutButton;
    }

    public WebElementFacade getcheckOutBeliSekarang() {
        return checkOutBeliSekarang;
    }

    public WebElementFacade getOtherCheckoutButton() {
        return otherCheckoutButton;
    }

    public void setOtherCheckoutButton(WebElementFacade otherCheckoutButton) {
        this.otherCheckoutButton = otherCheckoutButton;
    }

    public WebElementFacade getThankyouSentence() {
        return thankyouSentence;
    }

    public void setThankyouSentence(WebElementFacade thankyouSentence) {
        this.thankyouSentence = thankyouSentence;
    }
}
