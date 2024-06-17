Feature: WikiPage Automation

  @Collections
  Scenario: Validate the mapping of column1 and column2
    Given user extracts the column one value
    When user extracts the column two value
    Then user validates the mapping

   @MapInterface
   Scenario: Key to Value pair validation
     Given user validates the key and value pair relation of share holders and share holdings