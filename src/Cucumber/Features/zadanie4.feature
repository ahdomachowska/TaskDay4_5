Feature: add address

  Scenario Outline: add first address
    Given user is logged in on account page
    When user click add my first address
    When user fills form with data "<address>", "<postalCode>", "<city>", "<country>", "<homePhone>"
    And click Save button to add first address
    Then first address is added


    Examples:
      |address  |postalCode|city|country|homePhone|
      |Nowa     |83-110    |Tczew|Polska|729111876|