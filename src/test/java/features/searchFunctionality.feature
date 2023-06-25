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
@Release1.0
Feature: Search Functionality
Customer will be able to search for product available.

@Regression
Scenario: Positive Search fucntionality test with clicking search button
Given Customer is in homepage
When customer enters valid product in search text field
And click search button
Then customer should be in product result page
And should see all available products

@Regression
Scenario: Positive Search fucntionality test by hitting Enter key
Given Customer is in homepage
When customer enters valid product in search text field
And hit Enter key
Then customer should be in product result page
And should see all available products

@Regression
Scenario: Negative Search fucntionality test with clicking search button
Given Customer is in homepage
When customer enters invalid product in search text field
And click search button
Then customer should be in invalid product result page
And should see product not available error message

@Regression
Scenario: Positive Search fucntionality test by hitting Enter key
Given Customer is in homepage
When customer enters invalid product in search text field
And hit Enter key
Then customer should be in invalid product result page
And should see product not available error message

@Regression @E2E
Scenario Outline: Positive Search fucntionality test with data driven
Given Customer is in homepage
When customer enters valid "<product>" in search text field
And click search button
Then customer should be in "<product>" result page
And should see all available products

Examples:
|product|
|apple|
|samsung|
|pixel|
|mac|
|surface pro|

