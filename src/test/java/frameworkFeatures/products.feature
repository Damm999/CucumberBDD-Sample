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

Feature: Products
  Validate promo code in products page

  Scenario Outline: Validate Promo code alert is visible when clicking on special offers link
    Given I navigate to "<url>"
    When I click on "<element>" button
    Then User should be presented with promo alert with messsage as "<promo>"

    Examples: 
      | url  | element | promo  |
      | http://webdriveruniversity.com/Page-Object-Model/products.html# | #container-special-offers | NEWCUSTOMER773322 |
      | http://webdriveruniversity.com/Page-Object-Model/products.html# | #container-product2 | NEWCUSTOMER773322 |
      | http://webdriveruniversity.com/Page-Object-Model/products.html# | #container-product2 | NEWCUSTOMER7733212 |
     
    