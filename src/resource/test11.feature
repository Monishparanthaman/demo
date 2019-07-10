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
@tag
Feature: launch app

Background: browser launch
Given  browser should be availble
When  user opens the application
Then browser opened 
  @tag1
  Scenario: login function
    Given user should have id
    When user enter id
    Then app logged in

  @tag2
  Scenario: add product
    Given user knows the product
    When user adds the product 
    Then product shows in the cart


