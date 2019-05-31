#Author: Love kumar
Feature: Homepage
  Description: Each scenarios on this feature will be a differnt functionality of home page

  Background: User launch the application
    Given User is on homepage of Masherqbank

  @Homepage
  Scenario: Verify the Navigation bar at desktop deivces
    Then Validate the page title is 'Best Consumer Digital Bank UAE | Personal Banking | Mashreq Bank'
    And Verify Navigation bar is displayed to user
    And Verify '9' items displayed at navigation bar
      | Corporate               |
      | Business                |
      | International           |
      | Private Banking         |
      | Al Islami               |
      | Gold                    |
      | Mashreq Securities      |
      | Mashreq Capital         |
      | Mashreq Global Services |

  @Homepage
  Scenario: Verify Mashreq News should be displayed on the homepage
    Then User verify News box should be visible on home page
    And User verify the title of News box should be 'Mashreq News'

  @Homepage
  Scenario: Verify “Contact Us” at the footer of homepage
    Then User verify 'Contact Us' is visible at homepage
    When User click on Contact Us Page at footer
    Then Validate the page title is 'Contact us | Personal Banking | Mashreq Bank'
    And Verify user reached to Contact Us Page
