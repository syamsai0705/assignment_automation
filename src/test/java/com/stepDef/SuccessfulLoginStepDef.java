package com.stepDef;

import com.base.Util;
import com.page.LogInnPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SuccessfulLoginStepDef extends LogInnPage {

    @Given("User launch Gmail application")
    public void user_Launch_Gmail_Application() {
        getURL(Util.readProperties("gmail"));
        setenv("gmail");

    }

    @When("Enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2) {
       if (isElementPresentWithNoException(email, 5)) {
            type(email, string);
            staticWait(3);
            click(nextButton);
            type(password, string2);
            staticWait(3);
            click(nextButton);
        }
    }



    @When("Clicks on the Compose button")
    public void clicksOnTheComposeButton() {
        click(composeButton);
        staticWait(3);
    }

    @And("Click Send")
    public void clickSend() {
        click(sendKey);
        staticWait(3);
    }

    @And("Enters {string} in the field")
    public void entersInTheSubjectField(String string) {
        type(subject, string);
        staticWait(3);
    }

    @And("Enters {string} in the body field")
    public void entersInTheBodyField(String string) {
        type(body, string);
        staticWait(3);
    }

    @And("Enters {string} in the To field")
    public void entersAEmailInTheToField(String string) {
        type(toFiled, string);
        staticWait(3);
    }

    @And("Leaves the subject field empty")
    public void leavesTheSubjectFieldEmpty() {
        click(toFiled);
        staticWait(3);
    }

    @And("Leaves the body field empty")
    public void leavesTheBodyFieldEmpty() {
        click(body);
        staticWait(3);
    }

    @And("Leaves the To field empty")
    public void leavesTheToFieldEmpty() {
        click(toFiled);
        staticWait(3);
    }

    @Then("An Error message should appear")
    public void anErrorMessageShouldAppear() {
        click(errormesg);
        staticWait(3);
    }

    @And("View the Message")
    public void viewTheMessage() {
        click(viewMesg);
    }
}
