@user_gmibank_registration
  Feature: resgistration feature

    Scenario Outline: user_should_register

      Given user is on the registration page
      And user enters ssn number as  "<SSN>"
      And user enters firstname "<firstname>" and lastname"<lastname>"
      And user provides address "<address>"
      And user provides phonenumber "<phoneNumber>"
      And user provides username "<username>"
      And user provides email "<email>"
      And user provides the firstPassword as "<firstPassword>" and secondPassword "<secondPassword>"
      And user clicks on the register button and see the success message as "<successMessage>"

      Examples:
      |SSN          |firstname|lastname|address    |phoneNumber |username|email             |firstPassword  |secondPassword|successMessage|
      |833-32-3278  |Hamdi    |kus     |Melek sokak|989-876-5445|Sametcan|samuel@gmail.com  |Abc123!@       |Abc123!@      |Registration saved!  |
