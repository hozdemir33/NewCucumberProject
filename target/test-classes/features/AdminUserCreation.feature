


  @Admin_creation

    Feature: admin should be able to create a new user

      Scenario: Admin_login_to_create_a_new_User

        Given user is on the login page
        And user clicks on sign in button section
        And user clicks on sign in UserName section
        And user clicks on newPassword section
        And user clicks on SignInButton
        And user clicks on Admin Menu
        And user clicks on the User Management
        Then user verified USERS SIGN
        Then close the application

