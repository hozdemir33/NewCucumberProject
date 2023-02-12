
#All feature files must start with Feature keyword.There can be ONLY 1 Feature keyword per file
#Feature describe the overal test cases. It can be a USER STORY NAME
  #Google_Search_Functionality


@google_search
Feature:Google_Search_Functionality

  Background: user_is_on_the_google_page
    Given user is on the google page
  #Background key word is used before each Scenario
  # Given user is on the google page

  #Scenario =Test Case
  # Under scenario we will have TEST STEPS
  #Given, When, And , Then annontations**
  #These are Gherkin keywords
@Iphone_search
  Scenario: TC_01_iphone_search
    When user search for iPhone on google
    Then verify the iPhone related
    Then close the application

@TeaPOT_search
    #We can CREATE MULTIPLE ScenariOS
    Scenario: TC02_teapot_search
      When user search for Tea Pot on google
      Then verify the Tea Pot related

@Flower_search @wip
      Scenario: TC03_Flower
        When user search for flower on google
        Then verify the flower related

