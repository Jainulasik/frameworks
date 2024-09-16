$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel through Adactin website",
  "description": "",
  "id": "booking-hotel-through-adactin-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login Functionality :",
  "description": "",
  "id": "booking-hotel-through-adactin-website;login-functionality-:",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User launch the Url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Enter the Username in name section",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User Enter the password in password section",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click the Login button and It goes to [Search hotel] page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_launch_the_Url()"
});
formatter.result({
  "duration": 1058510300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_Username_in_name_section()"
});
formatter.result({
  "duration": 2161299100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_password_in_password_section()"
});
formatter.result({
  "duration": 58944900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_the_Login_button_and_It_goes_to_Search_hotel_page()"
});
formatter.result({
  "duration": 1029471400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Search hotel Functionality :",
  "description": "",
  "id": "booking-hotel-through-adactin-website;search-hotel-functionality-:",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User Select the location in location field",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User Select the Hotels in Hotel field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Select the Roomtype in Room field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Select the Number of rooms in Number of Rooms field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Select In date in Check In date field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Select out date in check In date field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User Select the Adults per room in Adults Room field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Select the Children per room in Child room field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User Click the Search button and It goes to [Select hotel] page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_the_location_in_location_field()"
});
formatter.result({
  "duration": 260000600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Hotels_in_Hotel_field()"
});
formatter.result({
  "duration": 161586200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Roomtype_in_Room_field()"
});
formatter.result({
  "duration": 163891300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Number_of_rooms_in_Number_of_Rooms_field()"
});
formatter.result({
  "duration": 170588600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_In_date_in_Check_In_date_field()"
});
formatter.result({
  "duration": 117742500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_out_date_in_check_In_date_field()"
});
formatter.result({
  "duration": 103948800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Adults_per_room_in_Adults_Room_field()"
});
formatter.result({
  "duration": 111720800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Children_per_room_in_Child_room_field()"
});
formatter.result({
  "duration": 143993300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_the_Search_button_and_It_goes_to_Select_hotel_page()"
});
formatter.result({
  "duration": 713073400,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Continue Functionality :",
  "description": "",
  "id": "booking-hotel-through-adactin-website;continue-functionality-:",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User click the selected hotel name .",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "User click the Continue button and It goes to [Book a Hotel] page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_click_the_selected_hotel_name()"
});
formatter.result({
  "duration": 60283100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_the_Continue_button_and_It_goes_to_Book_a_Hotel_page()"
});
formatter.result({
  "duration": 712922700,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Book a Hotel/Book now Functionality :",
  "description": "",
  "id": "booking-hotel-through-adactin-website;book-a-hotel/book-now-functionality-:",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": "User Enter the First name in First name section",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "User Enter the Last name in Last name Section",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "User Enter the Billing Address in Address section",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User Enter the Credit Card number on Credit card number section",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "User Select the Credit card type in Credit card section",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User Select the expiry date and year of credit card in Expiry date section",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "User Enter the Cvv num in Cvv section",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User click the Book now button and It goes to Booking Confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_First_name_in_First_name_section()"
});
formatter.result({
  "duration": 72951000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_Last_name_in_Last_name_Section()"
});
formatter.result({
  "duration": 59099300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_Billing_Address_in_Address_section()"
});
formatter.result({
  "duration": 64850900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_Credit_Card_number_on_Credit_card_number_section()"
});
formatter.result({
  "duration": 64478600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Credit_card_type_in_Credit_card_section()"
});
formatter.result({
  "duration": 138996900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_expiry_date_and_year_of_credit_card_in_Expiry_date_section()"
});
formatter.result({
  "duration": 475569300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_Cvv_num_in_Cvv_section()"
});
formatter.result({
  "duration": 67114400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_the_Book_now_button_and_It_goes_to_Booking_Confirmation_page()"
});
formatter.result({
  "duration": 51071900,
  "status": "passed"
});
formatter.scenario({
  "line": 62,
  "name": "My Itenary Functinality :",
  "description": "",
  "id": "booking-hotel-through-adactin-website;my-itenary-functinality-:",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 64,
  "name": "User click  My Itinerary button  and   It goes to Booked Itinerary\tpage",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_click_My_Itinerary_button_and_It_goes_to_Booked_Itinerary_page()"
});
formatter.result({
  "duration": 9072072300,
  "status": "passed"
});
formatter.scenario({
  "line": 67,
  "name": "Cancel selected Functionality :",
  "description": "",
  "id": "booking-hotel-through-adactin-website;cancel-selected-functionality-:",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 69,
  "name": "User click select  all options.",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "User click Cancel selected button.",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "User click the ok button to cancel and it goes to Logout page",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "User click the Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_click_select_all_options()"
});
formatter.result({
  "duration": 86015200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_Cancel_selected_button()"
});
formatter.result({
  "duration": 68163500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_the_ok_button_to_cancel_and_it_goes_to_Logout_page()"
});
formatter.result({
  "duration": 16571700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_the_Logout_button()"
});
formatter.result({
  "duration": 1358317800,
  "status": "passed"
});
formatter.scenario({
  "line": 77,
  "name": "checking strict",
  "description": "when user click",
  "id": "booking-hotel-through-adactin-website;checking-strict",
  "type": "scenario",
  "keyword": "Scenario"
});
});