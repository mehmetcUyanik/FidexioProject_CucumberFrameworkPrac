package com.fidexio.step_defs;

import com.fidexio.pages.CRM_QuotationsPage;
import com.fidexio.pages.MassMailingsPage;
import com.fidexio.pages.SurveysPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MassMailingsStepDefs {
    MassMailingsPage massMailingsPage=new MassMailingsPage();

    CRM_QuotationsPage massMailings= new CRM_QuotationsPage();

    @When("the user clicks on the {string} button in the Mass Mailings")
    public void theUserClicksOnTheButtonInTheMassMailings(String ButtonType) {
        massMailings.clickButtons(ButtonType);

    }


    @When("user enters subject name as {string}")
    public void user_enters_subject_name_as(String subjectTitle) {
        BrowserUtils.waitFor(5);
        massMailingsPage.subjectBox.sendKeys(subjectTitle);


    }

    @Then("verify that title changes to {string}")
    public void verify_that_title_changes_to(String expectedTitle) {
        massMailingsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(5);
        String actualTitle= Driver.get().getTitle();

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("user clicks on a random Mass mailings")
    public void user_clicks_on_a_random_Mass_mailings() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user edits the name of the subject")
    public void the_user_edits_the_name_of_the_subject() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that the Subject name has been changed")
    public void verify_that_the_Subject_name_has_been_changed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks on a random Mass mailings")
    public void the_user_clicks_on_a_random_Mass_mailings() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks on the {string} from the pop up button")
    public void the_user_clicks_on_the_from_the_pop_up_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user verifies the Mass mailings number has not changed")
    public void user_verifies_the_Mass_mailings_number_has_not_changed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user opens Actions dropdown and clicks Delete")
    public void the_user_opens_Actions_dropdown_and_clicks_Delete() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that  Mass Mailings  has been deleted")
    public void verify_that_Mass_Mailings_has_been_deleted() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
