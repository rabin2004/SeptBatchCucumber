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
@Release2.0
Feature: Login Functionality
Customer should be able to login into the app by providing valid crendentials

@Regression
Scenario: Negative Login functionality with both invalid credentials
Given Customer is in homepage
And customer clicks account & list link
And is now in Sign in page
When customer enter invalid username
And clicks continue button
And in enter invalid password
And clicks sign in button
Then sign in should be unsuccessful
And error message should be displayed

@newScenario @E2E
Scenario Outline: Negative Login functionality with data drivin
Given Customer is in homepage
And customer clicks account & list link
And is now in Sign in page
When customer enter invalid "<username>"
And clicks continue button
And in enter invalid "<password>"
And clicks sign in button
Then customer should still be in "Amazon Sign-In" page
And error message should be displayed

Examples:
|username		|			password|
|test@gmail.com|test123|
|test12@gmail.com|test1234|


