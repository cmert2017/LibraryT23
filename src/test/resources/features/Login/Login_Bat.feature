Feature: Login feature

  @librarian  @allRoles @student @guest
  Scenario Outline: Login as a <role>
    Given I am on the login page
    Then I login as a "<role>"
    Then dashboard should be displayed

    Examples: these are the different roles
    |role|
    |librarian|
    |student  |

