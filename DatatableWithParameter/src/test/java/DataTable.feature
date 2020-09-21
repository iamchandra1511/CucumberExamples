Feature: Sample test
  Search Chercher Tech in Google and click first result

  Scenario Outline: Search Google for Chercher Tech
    Given There is opened "<browser>"
    When I searched "<searchterm>" in searchbar
    And When I press Enter key
    Then I should see results
    Then I click on the First result to see the Home page

    Examples:
      | browser | searchterm        |
      | chrome  | selenium chercher |