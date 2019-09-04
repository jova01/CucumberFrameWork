package com.vytrack.step_definition;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDefinitions extends Pages{
    Pages pages=new Pages();


    @Then("user logs in as a store manager")
    public void userLogsInAsAStoreManager() {
        loginPage().login(ConfigurationReader.getProperty("storemanagerusername"),ConfigurationReader.getProperty("storemanagerpassword"));
        loginPage().waitUntilLoaderScreenDisappear();
    }

    @Then("user verifies that {string} page name is displayed")
    public void user_verifies_that_page_name_is_displayed(String expected) {
        Assert.assertEquals(expected,dashboardPage().getPageSubTitle());

    }

    @Then("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String wrongUsername, String wrongPassword) {
      loginPage().login(wrongUsername,wrongPassword);
    }

    @Then("user verifies that {string} warning message is diplayed")
    public void user_verifies_that_warning_message_is_diplayed(String expected) {
        Assert.assertEquals(expected, loginPage().getErrorMessage());
    }

    @Then("user logs in as a driver username {string} and password {string}")
    public void user_logs_in_as_a_driver_username_and_password(String username, String password) {
        loginPage().login(username,password);
        loginPage().waitUntilLoaderScreenDisappear();

    }

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage().login(string);
        loginPage().waitUntilLoaderScreenDisappear();

    }


    @Given("user logs in with following credentials")
    public void user_logs_in_with_following_credentials(Map<String, String> values) {
        System.out.println(values);
        loginPage().login(values.get("username"), values.get("password"));
        loginPage().waitUntilLoaderScreenDisappear();
    }






}
