@regression
Feature: Adding new job

  Scenario: Adding new job:

    When user logs in to application
    And user selects Job from New menu
    And user adds new job
    Then user verifies in Activity feed that job was created
