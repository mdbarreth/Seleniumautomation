Feature: Application Login

Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "bar" and password "123"
Then Homepage is populated
And Cards displayed are "true"

Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "moh" and password "456"
Then Homepage is populated
And Cards displayed are "false"