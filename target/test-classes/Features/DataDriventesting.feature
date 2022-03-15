Feature: Study Data Driven Testing using Scenario Outline

Scenario Outline: Sample Data Driven test case
		Given I have numbers from <row>
		When  I add them
		Then  Verify if the result is prime number
		
Examples:
|row|
|1 |
|2 |
|3 |
|4 |
|5 | 