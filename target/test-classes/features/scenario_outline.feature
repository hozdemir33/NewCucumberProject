
@screnario_outline
  Feature: search_using_scenario_outline

    Background: user is on the google page

          # Scenario Outline MUST FOLLOW THE EXAMPLES KEY WORD:
    Scenario Outline: google_search_test

      When user is searching for "<item>"
      Then verify the result has "<item>"
      Then close the application

      Examples:test_data
      |item   |
      |teapot |
      |tesla  |
      |iPhone |
      |honda  |

  #What is scenario outline?  When do you use it?
  #Scenario outline is used to run same scenario with multiple different test data
  #Scenario Outline must follow the examples keyword.
  #Scenario outline DDT testing.








