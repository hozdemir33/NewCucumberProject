
@emplyee_login_scnario_outline
Feature: employee_login

  Scenario Outline: login_with_empl_credentials

    Given user is on the login page
    And  user clicks on login dropdown
    And user clicks on sign in button
    And user provides "<username>" and "<password>"
    And user clicks on the login button

    Examples: credentials

    |username       |password      |
    |gino.wintheiser|%B6B*q1!TH|
    |dallas.batz    |dOWjuXz8*es6  |
    |leonel.skiles  |x3uvY0f8hw1T  |
    |freddy.veum    |*f**3dafHW3Jx |
    |syble.jerde    |2*0R*!K&GB3T%G|
    |julius.keebler |F&134#R%0d    |




