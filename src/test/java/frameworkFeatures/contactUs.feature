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
Feature: Submit Data to webdriverunivercity.com using contact us form
 I want to fill the contact us from and sumbit the data

  Scenario: Submit valid data via contact us form
    Given I navigate to webdriveruniversity contact us from
    When I enter a valid first name
    | John | Loke | Poshni |
    And I enter a valid last name
    And I enter a valid email address
    And I enter valid comments
    |eample comments one| example comments two|example comments three|
    When I click on submit button on the page
    Then The information should be successfully submmited via contact us form