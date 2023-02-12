
  Feature: Search_functionality

    Background: user_is_on_the_page
      Given user is on the google page

    @i_search
      Scenario: TC01_iphone_search
      When user search for "iPhone"
      Then verify the result has "iPhone"
      Then close the application

    @BMW_search
        Scenario: TC02_BMC
        When user is searching for "BMW"
        Then verify the "BMW" related results
        Then close the application

      @tesla_search
      Scenario: TC03_Tesla_Search

        When user is searching for "tesla" car
        Then verify the "tesla" results
        Then close the application


