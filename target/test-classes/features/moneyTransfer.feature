
  @money_Transfer
  Feature: money transfer feature

    Scenario Outline: money_from_checking_saving

      Given user is on the GMIBANK
      And user places username "<userN>" and password "<passW>"
      And user clicks on sign in button
      And user clicks on My Operation sign
      And user clicks on Money transfer sign
      Examples:testing_the_money_transfer_page

      |userN           |passW           |
      |shaylee.lindgren|mVSk$eq1YoZwq   |


      @Sending_Money
      Scenario: sendingMoneytoSomeone

        Given user clicks on the FromLink and chooses Checking Account and click on the checking account
        And user clicks on the ToLink and clicks on the SavingAccount
        And user clicks on the Balance place and sends "50"
        And user writes the desciption of the transfering money
        And user clicks on the "Make transfer" button
        Then user verifies the success message







