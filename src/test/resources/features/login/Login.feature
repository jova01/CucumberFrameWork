@VYT-4121
Feature: As user I want to login under different roles


  Background:

  @storemanager
  Scenario: Login as a store manager
    Then user logs in as a store manager
    And user verifies that "Dashboard" page name is displayed


  @negative
  Scenario: Verify warning message for invalid credentials
    Then user logs in with "wrong" username and "wrong" password
    And user verifies that "Invalid user name or password." warning message is diplayed


  @driver
  Scenario: Login as driver
    Then user logs in as a driver username "user5" and password "UserUser123"
    And user verifies that "Quick Launchpad" page name is displayed


  @map_example
  Scenario: Login as different users
    Given user logs in with following credentials
      | username | salesmanager101 |
      | password | UserUser123     |
    Then user navigates to "Fleet" and "Vehicles"
    And user verifies that "All Cars" page name is displayed

  @login_1
  Scenario Outline: login as different user tests
    Given user logs in as a "<user_type>"
    And user verifies that "<page name>" page name is displayed
    Examples:
      | user_type    | page name       |
      | driver       | Quick Launchpad |
      | salesmanager | Dashboard       |
      | storemanager | Dashboard       |


    #use qa3
  @login_with_outline_2
  Scenario Outline: User names test
    Given user logs in with following credentials
      | username | <username> |
      | password | <password> |
    Then user name should be "<name>"
    Examples: Credentials information
      | username        | password    | name             |
      | user187         | UserUser123 | Jerel Vandervort |
      | user200         | UserUser123 | Lonzo Leuschke   |
      | storemanager52  | UserUser123 | Roma Medhurst    |
      | storemanager66  | UserUser123 | Carlos Ernser    |
      | salesmanager125 | UserUser123 | Cleveland Heller |
      | salesmanager140 | UserUser123 | Jameson Paucek   |


  @demo_3
  Scenario Outline: page titles with different users
    Given user logs in as a "<user_type>"
    Then user navigates to "<tab>" and "<module>"
    Then the page title should be "<title>"
    Examples: User and navigation info
      | user_type     | tab        | module          | title                                                              |
      | driver        | Fleet      | Vehicles        | Car - Entities - System - Car - Entities - System                  |
      | driver        | Fleet      | Vehicles Model  | Vehicles Model - Entities - System - Car - Entities - System       |
      | driver        | Customers  | Accounts        | Accounts - Customers                                               |
      | driver        | Customers  | Contacts        | Contacts - Customers                                               |
      | driver        | Activities | Calendar Events | Calendar Events - Activities                                       |
      | driver        | System     | Jobs            | Jobs - System                                                      |
      | salesmanager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | salesmanager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | salesmanager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | salesmanager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | salesmanager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | salesmanager | System     | Jobs            | All - Jobs - System                                                |
      | storemanager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | storemanager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | storemanager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | storemanager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | storemanager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | storemanager | System     | Jobs            | All - Jobs - System                                                |