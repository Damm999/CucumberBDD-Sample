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
Feature: Login Feature Validation with Example structure
  A user enter an valid credentials and gets an successful login alert
  A user enters an in-valid credential and gets unsuccessful login alert

  Scenario Outline: Login with mutilple credentials and validations
    Given I try to access "<url>" website in "<browser>"
    When I click on login link button
    And I enter a "<username>"
    And I enter "<password>" password
    When I click login button
    Then I should be presented with the following prompt alert "<message>"
    
   Examples: 
      | url  | username | password | message| browser|
      | http://webdriveruniversity.com/ |  webdriver | webdriver123 | validation succeeded | chrome |
      | http://webdriveruniversity.com/ |  webdriver1 | webdriver123 | validation failed | chrome |