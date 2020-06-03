Feature: HCM UAT Service Request
@HCM_UserServiceRequest
Scenario: I am Testing HCM UAT Service Request
Given I Login with user credentials
When I navigate to Employee page
And I check the different tabs
And I enter into Service Request tab and fill the form and submit
Then I should get success message

@Expense
Scenario: I raised new Service Request
Given I Login with user credentials
When I navigate to Employee page
And I clicked on Expenses tab
And I entered mandatory fields and click on Submit button
Then I should see Thank you! This case has been routed for approval.
