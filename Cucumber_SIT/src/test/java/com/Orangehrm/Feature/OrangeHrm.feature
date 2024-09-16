Feature: Customising Hr requirements using OrangeHrm website


Background: Login function

Given User launch the Url 

When User enter the Username in username section

And User enter the password in password section

Then User click on login button And It navigate to the Dashboard page

@smoke
Scenario: Admin function

When User click on Admin field And it goes to Admin page

And User click on Configuration in configuration field

And select Email configuartion in Configuration field

And User enter the mail id in Mail sent As field.

And User select enable button in  Send test mail 

And User enter Test mail address in Test mail address section

And User Saved .


Scenario: PIM function 

When User click on PIM field And it goes to PIM page

And User click on Add employee And It goes to Add employee page

And User enter the first name in first name field

And User enter the last name in last name field

And User click on create Login enable option

And User enter the Username in username field 

And User enter the password in password field

And User enter the confirm password in confirm password field 

Then User saved

Scenario: Time Functionality

When User click on Time field and it goes to Time page
And User click on project info in project info field
And User Select Customers And It goes to customer page
And User click Add option in add field
And User Enter the name in name field
And User Enter the description in description field
And User Saved

Scenario: My info Functionality

When User click on My info field and it goes to my info page
And User enter first name in first name fieldd
And User enter middle name in middle name field
And User enter last name in last name field
And USer enter the Nickname in nick name field
And User select license date num in license field
And user select marital status in marital sattus field
And User selet gender option
Then User saved3

Scenario: Buzz Functionality

When User click on Buzz field and It goes to BUzz page
And User Click on whats on your mind search option 
And User clicked post button

Scenario: Logout Functionality 

When User click on dropdown option in top corner
And User select Logout in dropdown field









