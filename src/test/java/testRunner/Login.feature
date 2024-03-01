Feature: Login Functionality Feature
In order to check login functionality works,
I want run cucumber framework to check working or not.
Scenario: Login Functionality
Given User navigate Orange URL
When User logs in with username and with password
When User clicks on Login button
Then User Validates URL
Then User Close Application