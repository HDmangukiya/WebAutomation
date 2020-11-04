Feature: Provide User with correct information related to Calculator fields

As a Product Owner I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present So that The user is able to get a clear understanding of what needs to be entered in the field.

Scenario: When the User Clicks on information icon besides Current age the message related to Current age is displayed. 
    Given I navigate to Westpac Home Page 
    And I select "KiwiSaver Calculators" from "KiwiSaver" main menu
    Then the "KiwiSaver Calculators" page loads
    And I click on "Click here to get started."
    Then the "KiwiSaver Retirement Calculator" page loads
    And I click on information icon besides "Current age" field
    Then a message: "This calculator has an age limit of 18 to 64 years old." is displayed below the "Current age" field