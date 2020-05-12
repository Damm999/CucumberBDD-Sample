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
Feature: Login Feature Validation
  A user enter an valid credentials and gets an successful login alert
  A user enters an in-valid credential and gets unsuccessful login alert

  Background: 
    Given I try to access webdriveruniversity website
    When I click on login portal button
    And I enter a username

  Scenario: Login with vlaid credentials
    And I enter a "webdriver123" password
    When I click on login button
    Then I should be presented with successful validation alert

  Scenario: Login with invlaid credentials
    And I enter a "invalid" password
    When I click on login button
    Then I should be presented with a unsuccessful validation alert
