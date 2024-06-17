Feature:LearMore Page Automation
 @alert1
  Scenario: Alert message validation in the confirmation box
    Given user click on the confirmation box button
    Then user validate the alert message
    And user validate the UI message

  @explicit1
  Scenario: Change in text validation
    Given user clicks on change text button
    Then validate the change text value