Feature: Application login
Background:
Scenario: Home page defult login
Given user is on netbanking landing page
When  user login into application with "abc" name and password "123"
Then home page is populated
And Cards are displyed "true"
@Regression 
Scenario: Home page defult login
Given user is on netbanking landing page
When  user signup with
|abc | 14154 | ufjif |hfhf|hfvhnj|bhfh|
Then home page is populated
And Cards are displyed "false"