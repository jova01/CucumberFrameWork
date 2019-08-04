Feature: As user I want to login under different roles

  Scenario: Login test (negative)
    Given Open Vytrack login page
    When Enter valid username and invalid password credentials
    And Click login button
    Then Message Invalid user name or password. should be displayed
    And Page title and url should be the same

