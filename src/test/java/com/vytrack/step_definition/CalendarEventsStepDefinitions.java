package com.vytrack.step_definition;

import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class CalendarEventsStepDefinitions extends Pages{



    @Then("following table headers should be displayed")
    public void following_table_headers_should_be_displayed(List<String> values) {
        Assert.assertEquals(values, calendarEventsPage().getTableHeaders());
    }
}
