Feature: Login into account
  Exsisting user should be able to login using correct credentials

  Scenario: Login into accout with correct credentials
    Given User navigates to newtours website
    And User clicks on login button on homepage
    And User enters a valid username
    And User enter a valid password
    When User selects on login button
    Then User should be taken to successfull login page
