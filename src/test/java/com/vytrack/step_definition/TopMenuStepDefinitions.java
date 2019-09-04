package com.vytrack.step_definition;

import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class TopMenuStepDefinitions extends Pages{




    @Then("user navigates to {string} and {string}")
    public void user_navigates_to_and(String tab, String module) {
        dashboardPage().navigateToModule(tab,module);

    }


    @Then("user name should be {string}")
    public void user_name_should_be(String string) {
        Assert.assertEquals(string, loginPage().getUserMenuName());

    }


    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expected) {
        Assert.assertEquals(expected, vehiclesPage().getPageTitle());
    }



}
