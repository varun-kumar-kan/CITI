Feature: Login to application

Scenario: Open links in google chrome window
	Given I am on url "https://www.google.com"
	When I enter gmail in search box
	Then I should see the gmail link
