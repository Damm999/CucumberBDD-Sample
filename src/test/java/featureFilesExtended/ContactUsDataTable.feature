#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Submit data to webdriveruniversity website
  Performing data tables logic in filling the contact us form

  Scenario: Fill the contact us from with valid details
    Given I want to access webdriveruniversity website
    When I click on the contact us link
    And I enter first-name
    And I enter last-name
    And I enter email-address
    And I enter few comments
     | Hi can you please contact me?  | It's urgent. | Respond as early as possible.  |
    When I click on submit button on page
    Then The information should sucessfully be submitted via contact us page
