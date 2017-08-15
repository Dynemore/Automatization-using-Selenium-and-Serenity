package com.futures.steps;

import com.futures.Behaviour.BlibliHomePageBehaviour;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.futures.steps.serenity.EndUserSteps;

public class DefinitionSteps {
   @Steps
    BlibliHomePageBehaviour hpbehaviour;

   //Contoh dari blibli

//    @Steps
//    EndUserSteps endUser;
//
//    @Given("the user is on the Wikionary home page")
//    public void givenTheUserIsOnTheWikionaryHomePage() {
//        endUser.is_the_home_page();
//    }
//
//
//    @When("the user looks up the definition of the word '$word'")
//    public void whenTheUserLooksUpTheDefinitionOf(String word) {
//        endUser.looks_for(word);
//    }
//
//    @Then("they should see the definition '$definition'")
//    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
//        endUser.should_see_definition(definition);
//    }

    //untuk yang login
    @Given("open home page")
    public void givenOpenHomePage(){
        hpbehaviour.open();
    }

    @When("I login to blibli")
    public void whenLoginHomePage(){
        hpbehaviour.clickuserLogin();
    }

    @Then("I can see my name in the site")
    public  void thenSeeMyNameIntheSite(){
        hpbehaviour.checkUserAlreadyLoggedIn();
    }

    //untuk yang search dan add to cart
    @Given ("Already Logged in")
    public void givenAlreadyLoggedIn(){

    }

    @When ("I search product '$word' on search column")
    public void whenISearch(String word){
        hpbehaviour.typeSearch(word);
        hpbehaviour.clickSearch();
    }

    @When("I choose product of the first column")
    public void whenIchoose(){
        hpbehaviour.closeGojekPopUp();
        hpbehaviour.chooseProduct();
    }
    @When("I add the product to the bag")
    public void whenIaddProduct(){
        hpbehaviour.addToCart();
    }

    @Then("I see my bag contained")
    public void thenMyBagCobtained(){
        hpbehaviour.checkCartPopup();
    }

    //untuk yang pembayaran
    @Given ("Continue to pay")
    public void continueToPayment(){
        hpbehaviour.continueToPayment();
        hpbehaviour.continueToGreenPaymentButton();
    }

//    @When ("choose payment method")
//    public void choosePaymentMethod(){
//        hpbehaviour.chooseInternetBanking();
//    }

    @When ("insert BCA klik user id")
    public void insertUserId(){
        hpbehaviour.insertKlikBcaUserId();
    }

    @Then ("I see thank you page")
    public void thankyou(){
        hpbehaviour.clickLastCheckOutButton();

    }

}
