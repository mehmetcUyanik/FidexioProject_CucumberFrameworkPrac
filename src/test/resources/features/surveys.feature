@fc
Feature: As a Posmanager, I should be able to create and design a new survey from "Surveys" module

  Background:
    Given the user is logged in as posmanager
    When the  user clicks on the  Surveys module

  Scenario Outline: verify that <buttonType> button work as expected in the survey design page


    When the user clicks on the "<buttonType>"
    Then the user   navigates to "<expectedPage>"

    Examples:

      | buttonType | expectedPage  |
      | Create | createPage     |
      | Kanban | kanbanViewPage |
      | List   | listViewPage   |
      | Import | loadFilePage  |



    Scenario:Verify that the "Survey created" message appears

      When the user clicks on create button
      And the user enters survey title as "Customer Survey3"
      And the user clicks on Save Button
      Then the user should see "Survey created" message



  Scenario: Verify that user can not create a survey without Survey Title

    When the user clicks on create button
    And the user clicks on Save Button
    Then the user should see error message


    Scenario: Verify that the user should be able to see created survey is listed after clicking the Surveys module.

      Then the user should be able to see created survey is listed