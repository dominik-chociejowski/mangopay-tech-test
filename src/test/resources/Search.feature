Feature: Google Maps search
  It is highly recommended that search should work on Google Maps.

  Scenario Outline: Search bar Paris test for <language>
    Given a user is on "<language>" Google Maps page
    When the user enters "<city>" in the search box
    And clicks “Search”
    Then the left panel should have "<city>" as the headline text
    Examples:
      | language | city   |
      | en-GB    | Paris  |
      | pl       | Paryż  |
      | nl       | Parijs |

  Scenario Outline: Destination field test for
    Given a user is on "<language>" Google Maps page
    When the user enters "<city>" in the search box
    And clicks “Search”
    Then the left panel should have "<city>" as the headline text
    When the user clicks the “Directions” button
    Then the destination field should contain "<city>"
    Examples:
      | language | city   |
      | en-GB    | London |
      | pl       | Londyn |
