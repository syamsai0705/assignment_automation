package com.stepDef;

import com.page.LogInnPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class FailedCaseStepDef extends LogInnPage {
    @When("Enters Email  {string}")
    public void user_enters_email_(String string) {
        type(email, string);
        staticWait(3);
        click(nextButton);
    }

    @And("Enters Password  {string}")
    public void entersPassword(String string) {
        type(password, string);
        staticWait(3);
        click(nextButton);

    }
}
