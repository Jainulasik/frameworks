Feature: Booking Hotel through Adactin website


Scenario: Login Functionality :

Given User launch the Url

When User Enter the Username in name section

And User Enter the password in password section

Then User click the Login button and It goes to [Search hotel] page

@Smoke
Scenario: Search hotel Functionality :

When User Select the location in location field

And User Select the Hotels in Hotel field 

And User Select the Roomtype in Room field

And User Select the Number of rooms in Number of Rooms field

And User Select In date in Check In date field

And User Select out date in check In date field 

And User Select the Adults per room in Adults Room field

And User Select the Children per room in Child room field

Then User Click the Search button and It goes to [Select hotel] page
@Sanity

Scenario: Continue Functionality :

When User click the selected hotel name .

Then User click the Continue button and It goes to [Book a Hotel] page 


Scenario: Book a Hotel/Book now Functionality :

When User Enter the First name in First name section

And User Enter the Last name in Last name Section

And User Enter the Billing Address in Address section

And User Enter the Credit Card number on Credit card number section

And User Select the Credit card type in Credit card section

And User Select the expiry date and year of credit card in Expiry date section

And User Enter the Cvv num in Cvv section

Then User click the Book now button and It goes to Booking Confirmation page


Scenario: My Itenary Functinality :

Then User click  My Itinerary button  and   It goes to Booked Itinerary	page


Scenario: Cancel selected Functionality :

When User click select  all options.

And User click Cancel selected button.

And User click the ok button to cancel and it goes to Logout page

Then User click the Logout button 

Scenario: checking strict
when user click



