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

Feature: Submit our data to http://webdriveruniversity.com/ using contact us form
  A User should be able to submit his details via contact us form
  If a user click on reset button then all information should be removed from the contact us form 

Background:
	 Given I access webdriveruniversity website
	  When I click on contact us button
	  And I enter a firstName
    And I enter a lastName

  Scenario: Submit information using the contact us form.
    And I enter a email address
    And I enter comments
    When I click on submit button
    Then The information should be successfully be submitted via the contact us form

 Scenario: Submit inavlid information using the contact us form.
    And I enter invalid email address
    And I enter no comments
    When I click on submit button
    Then The information should be successfully be submitted via the contact us form
    But the user should also be notified of the problem
  
   Scenario: Reset button shloud clear information from contact us form after entring the information.
    And I enter a email address
    And I enter comments
    When I click on reset button
    Then All the information filled by the user should be removed. 	
  