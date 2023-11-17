@Feature2
Feature: To validate the account creation of fb application
@Sanity
Scenario: To create new account
Given To launch the browser and maximize the window
When To launch url of fb application
And To click the create new account button
# One dimensional map data
And To pass firstname in firstname text box
# key        value
|firstname1|sankar|
|fristname2|mani|
|fristname3|babu|
|fristname4|gauwri|

And To pass secondname in secondname text box

# Two dimensional map data
And To pass mobileno or email in email text box

|password1|password2|password3|
|567878|khgf|mnbgfd|
|56789|jhgfd|jhgfd|
|kjhgf|xcvbnm|sdfgh|
|dfghj|jhgfdertyu|lkjhgf|

And To create new password using newpassword textbox
Then To close the chrome browser

