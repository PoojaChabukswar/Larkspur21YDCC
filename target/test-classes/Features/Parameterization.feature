Feature:Verify how parameterization in cucumber works

Scenario:Passing numbers as parameter
		Given I have 7 and 5
		When I add them
		Then Verify that addition is even
		
@Regression @Smoke		
Scenario:Passing string as parameter
		Given I have first name as "Pooja"
		When I append last name "Chabukswar"
		Then I can see full name		
		
Scenario:Passing list as parameter
    Given I have following numbers:
    |10|18|
    |11|19|
    |22|31|		
    When I add all elements of list
    Then Verify that addition is even