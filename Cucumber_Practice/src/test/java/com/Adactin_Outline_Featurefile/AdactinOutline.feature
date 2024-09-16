Feature: Booking Hotel through Adactin website

Scenario Outline: Login Functionality :

Given User launch the Url

When User Enter the "<Username>" in name section

And User Enter the "<password>" in password section

Then User click the Login button and It goes to [Search hotel] page

Examples:

         | Username   | Password |
         |  Asi       |  1234    |
         |  Afi       | 1234567  |
         | Ashfi      | Asi@123  |
         | Asik232425 | 1234567  |










