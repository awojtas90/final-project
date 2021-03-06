Feature: Add address to user account

  Scenario Outline: Add address data to user account
    Given Page https://prod-kurs.coderslab.pl/ opened in browser
    When User click SignIn
    And fill Email
    And User fill Password
    And Submit Sign In button
    Then User see accountPage
    When User click Addresses
    And enter parametr1 <alias>
    And enter parametr2 <address>
    And enter parametr3 <city>
    And enter parametr4 <postcode>
    And enter parametr5 <country>
    And enter parametr6 <phone>
    And submit AddressData
    Then address data are added
    And address data are deleted
    And Close browser

    Examples:
      | alias  | address    | city  | postcode| country        | phone     |
      | agakk  | Wiosenna 13| Poznań| 61-677  |United Kingdom  | 678489789 |


