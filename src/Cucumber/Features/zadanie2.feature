Feature: new account registration

 Scenario Outline: create an account

    Given user is on authentication page
    When user inputs registration email as "<email>"
    And user clicks Create an account button
    When user fills form with data "<firstName>", "<lastName>", "<password>"
    And user clicks Register button
    Then user is registered

   Examples:
   |firstName|lastName |email              |password   |
   |Helena   |Test     |mail35@mail.com |password123|
   #|Alfons   |Testowy  |mail345@mail.com   |password345|

