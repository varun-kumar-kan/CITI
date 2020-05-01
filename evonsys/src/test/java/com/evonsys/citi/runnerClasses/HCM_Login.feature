Feature:  HCM_Login to application

@PegaLogin
Scenario: Validate PEGA Login functionality with invalid credentials
Given I am on login page
When I entered "<username>" in username field
Then I entered "<password>" in password field
Then I click on Submit button
	
