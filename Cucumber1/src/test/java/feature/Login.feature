Feature: Application login
Background:
Scenario: Home page defult login
Given user is on netbanking landing page
When  user login into application with "abc" name and password "123"
Then home page is populated
And Cards are displyed "true"

@web_test
Scenario: Home page defult login
Given user is on netbanking landing page
When  user login into application with "xyz" name and password "324"
Then home page is populated
And Cards are displyed "false"
@web_test
Scenario: Home page defult login
Given user is on netbanking landing page
When  user signup with
|abc | 14154 | ufjif |hfhf|hfvhnj|bhfh|
Then home page is populated
And Cards are displyed "false"
@web_test
Scenario Outline: Home page defult login
Given user is on netbanking landing page
When  user is signup with <username> and password is <password>
Then home page is populated
And Cards are displyed "false"


Examples:
|username |password|
|sintu1   |abcd    |
|sintu2   |abcd    |
|sintu3   |abcd    |
|sintu4   |abcd    |
|sintu5   |abcd    |

