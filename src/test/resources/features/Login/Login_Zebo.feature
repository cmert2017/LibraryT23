Feature: Login feature
  Agile Story: As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.

  @Librarian
  Scenario: Librarian login scenario
    Given User is on the login page
    When User logs in as librarian
    Then User should see dashboard

  @student
  Scenario: Student login scenario
    Given User is on the login page
    When User logs in as student
    Then User should see dashboard

  @admin
  Scenario: Admin login scenario
    Given User is on the login page
    When User logs in as admin
    Then User should see dashboard

  @Scenario_Outline
  Scenario Outline:  login as <role>
    Given User is on the login page
    When User logs in as "<role>"
    Then User should see dashboard
    Examples:
      | role      |
      | librarian |
      | student   |
      | admin     |