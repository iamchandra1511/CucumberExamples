Feature: Login

In order to perform successful login

As a user

I want to enter correct username and password


Scenario: In order to verify login to facebook

           Given user navigates to facebaook website
           When user validates the homepage title
           Then user entered valid username
           And user entered valid password
           Then user shouldbe successfully logged in
           
           
           
Scenario: In order to verify login to facebook as invalid user

           Given user navigates to facebaook website
           When user validates the homepage title
           Then user entered invalid username
           And user entered invalid password
           Then user shouldnot successfully logged in
     
            