Feature: Login Functionality Feature
In order to check login functionality works,
I want run cucumber framework to check working or not.
@tag1 #you can use any tag name
Scenario: Login Functionality
Given User navigate Orange URL
When User logs in with username and with password
When User clicks on Login button
Then User Validates URL
Then User Close Application

#Difference b/w scenario and scenario outline is that if you do multiple scenarion without duplicate step

@tag2
Scenario Outline: Login Functionality check with multiple data 
Given User Launch URL in "<Browser>" #it can be use as parameter
When User logs in with multiple data with username field "<Username>"
When User logs in with multiple data with password field "<Password>"
When User clcik on login button
Then User validate URL
Then User close browser
Examples:
|Browser|Username|Password|
|Chrome|Admin|Qedge123!@#|
|Firefox|Admin|Qedge123!@#|
|Chrome|Admin|Qedge123!|
|Firefox|Admin|Qedge123!|
