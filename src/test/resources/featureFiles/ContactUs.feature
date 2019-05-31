#Author: Love kumar
Feature: ContactUs
  Description: Each scenarios on this feature will be a differnt functionality of ContactUs

  Background: User launch the application
    Given User is on homepage of Masherqbank
    When User click on Contact Us Page at footer
    Then Validate the page title is 'Contact us | Personal Banking | Mashreq Bank'

  @ContactUs
  Scenario: Submitting the form without entering any details should indicate an error and specify which fields are required
    And Verify user reached to Contact Us Page
    When User click on Submit button of contact us form
    Then Verify Error is displayed for I am looking to text box
    And User Verify I am looking to… field is a dropdown with '4' choices

  @ContactUs
  Scenario: Verify Select sub products options
    Then User verify The '-- Select Sub Product -- ' field is initially empty
    When User Select the 'Loans' from Product dropdown
    Then User Verify Select Sub products have '6' options including 'Home Loan UAE Resident'

  @ContactUs
  Scenario: Verify Error for Mobile number with less than 7 didgit
    When User enter the mobile number '95408'
    Then User Verify Error is displayed when user enter less than 7 digit in mobile number
    When User enter the mobile number '9540883'
    Then User Verify No Error is displayed when user enter 7 digit number
