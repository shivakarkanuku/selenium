Feature: Login Functionaliry 
Scenario: Validation of login page for practice test page
Given User is on login page
When user enters the username as "student"
And user enters the password as "Password123"
And click on submit button
Then user successfully logged in to the page 