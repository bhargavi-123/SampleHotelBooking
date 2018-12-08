Feature: Hotel Booking form

Background: user is successfully loged in

Scenario: check the heading of the hotel booking page
Given user is on the hotel booking page
Then check the heading of the page

Scenario: successfull login with valid data
Descrption:to conform booking, user needs to enter all the mandatory fileds 
Given user is on the hotel booking page
When user enter all the mandatatory fields and click on conform booking
Then navigate to booking conformation page


Scenario: prompt user to enter the data when he leaves the first name field
Given user is on the hotel booking page
When user doesnt enter firstname and click on conform booking
Then display alert message

Scenario: prompt user to enter the data when he leaves the last name field
Given user is on the hotel booking page
When user doesnt enter lastname and click on conform booking
Then display alert message

Scenario: prompt user to enter the data when he leaves email field
Given user is on the hotel booking page
When user doesnt enter email and click on conform booking
Then display alert message

Scenario: prompt user to enter the data when he leaves the mobileNo field
Given user is on the hotel booking page
When user doesnt enter mobileno and clicks on confirm bokking button
 Then display alert message

Scenario: prompt user to enter the data when he leaves the city field
Given user is on the hotel booking page
When user doesnt enter city  and clicks on confirm bokking button
Then display alert message

Scenario: prompt user to enter the data when he leaves the state field
Given user is on the hotel booking page
When user doesnt enter state and  clicks on confirm bokking button
Then display alert message


Scenario: prompt user to enter the data when he leaves the noof guests staying field
Given user is on the hotel booking page
When user doesnt choose noof guests staying and clicks on confirm bokking button
Then display alert message

Scenario: prompt user to enter the data when he leaves the cardholdername field
Given user is on the hotel booking page
When user doesnt enter cardholdername and clicks on confirm bokking button
Then display alert message

Scenario: prompt user to enter the data when he leaves the debitcardnumber field
Given user is on the hotel booking page
When user doesnt enter debitcardnumber and clicks on confirm bokking button
Then display alert message

Scenario: prompt user to enter the data when he leaves the cvv field
Given user is on the hotel booking page
When user doesnt enter cvv  and clicks on confirm bokking button 
Then display alert message

Scenario: prompt user to enter the data when he leaves the expirationmonth field
Given user is on the hotel booking page
When user doesnt enter expitarionmonth and clicks on confirm bokking button
Then display alert message


Scenario: prompt user to enter the data when he leaves the expirationyear field
Given user is on the hotel booking page
When user doesnt enter expirationyear and clicks on confirm bokking button
Then display alert message

Scenario: Failure in hotel booking on giving mobile number invalid
Given user is on the hotel booking page 
When user enters invalid mobile no
|5000000000|
|0000000000|
|6745|
| |
|98778980900|
Then display alert message


Scenario: Failure in submitting on giving Email invalid
Given user is on the hotel booking page 
When user doesnt enter valid  Email id 
|bhanu|
|8989@gna|
|bharu.gmail.com|
|$$gana..com|
|bhargavi@gmail.com|
Then display alert message


Scenario Outline: validate the number of rooms allocated
Given user is on the hotel booking page 
When user enters <numberOfGuests>
Then allocate rooms such that 1 room for minimum 3 guests
Examples:
|numberOfGuests|
|3|
|6|
|9|

