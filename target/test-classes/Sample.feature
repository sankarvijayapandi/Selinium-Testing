@Feature1
Feature: To validate the login functionality of facebook aplication

Scenario: To validate login with username and invalid password
Background:
Given To launch  chrome browser and maximize window

@Regression
 When To launch the url of the facebook applicatioin
 And To pass valid username in email field
 And To pass invalid password in password field
 And To click the login button
 And To check whether navigate to homepage or not
 Then To close the browser

 @Smoke
 Scenario Outline: To validate the positive and negative combination of login functionality
 Given User has to launch the browser and maximize the window
 When User has to hit the facebook url
 And User has to pass the data"<emaildatas>" in the email field
 And User has to pass the data "<passworddatas>"in the password field
 And User has to click the login button
 Then User has to close the  browser
 
 Examples:
|emaildatas|passworddatas|
|sankar@gmail.com|royal|
|mani@gmail.com|mani|
|hari@gmail.com|hari|
|pink@gmail.com|pink|
|light@gmail.com|light|
|fan@gmail.com|fan|