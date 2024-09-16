Feature: Ordering phone products using amazon website
Scenarios: Mobiles functionality

When: user launch the amazon website and logged in
And user typed the mobile model in search box
And user click the desired phone and it goes to its dispalayed specs page
And user clicked buy now option and it navigate to payment option
Then user ordered succesfully on COD


Scenarios: create account functinality
When User launch the flipkart
And User enter the valid mobile number or email addres in login box
And User entered Valid OTP from registered number or mail id
Then User logged in Successfully and user can order anything.


Scenarios: grocery functionality
When User click the grocery button
And User click the soap prducts and it goes to soap details page
And  User select the Hamam soap category 
And User added to basket 
Then User paid via upi and Succfeully ordered

Scenarios: cancel order funstionality
When user goes to order options
And User select the their cancelling order product
And User filled up details for cancel order
And User select the payment method to refund
Then User cancelled succfelluy


Scenarios: Exchange order Functionality
When user launch the meesho website
And User goes to order option for seeing return available dues date
And user click the return option and it displayed refund or Exchange option
And user select the Excahnge option 
And user select valid dress and click Excahnge option 
Then USer returned order succefully


