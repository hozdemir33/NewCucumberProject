

  @Mercury_registration

    Feature: Mercury Registration

      Scenario Outline: user_Registers

        Given user gets on the mercury page
        And user place firstName "<firstName>" and lastName "<lastName>"
        And user place phone number "<phoneNumber>"
        And user place emailaddress "<email>"
        And user place address "<address>"
        And user place City "<city>"
        And user place State "<state>"
        And user place zipcode "<zipcode>"
        And user place Country "<country>"
        And user place UserName "<userName>"
        And user place firstPassword "<firstPassword>" and SecondPassword "<secondPassword>"
        And user clicks the SubmitButton
        Then user very the info

        Examples:
        |firstName|lastName     |phoneNumber |email          |address      |city|state  |zipcode|country          |userName|firstPassword|secondPassword|
        |Melek    |duralamaz    |656-673-7854|melek@gmail.com|2316 Melek dr|Reno|Georgia|78676  |UNITED STATES    |MMelekMelek|Melek123@ |Melek123@      |





