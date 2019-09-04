@smoke_test @VYT2-79
Feature: Smoke Test

  @VYT2-78 @VYT2-77
  Scenario: Login as different users
    Given user logs in with following credentials
      | username | salesmanager101 |
      | password | UserUser123     |
    Then user navigates to "Fleet" and "Vehicles"
    And user verifies that "All Cars" page name is displayed