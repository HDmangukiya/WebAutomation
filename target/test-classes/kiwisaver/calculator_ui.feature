Feature: Provide User with correct information related to Calculator fields

  As a Product Owner I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present So that The user is able to get a clear understanding of what needs to be entered in the field.

  Scenario: When the User Clicks on information icon besides Current age the message related to Current age is displayed.
    Given I navigate to Westpac Home Page
    And I select "KiwiSaver Calculators" from "KiwiSaver" main menu
    And I click on information icon besides "Current age" field
    Then click to Next Question
    And I could see WE’RE HERE TO HELP alert box
    Then I could see First Home option
    Then I could see dropdown for selection of expected years to purchase
    And I select 2years from dropdown
    Then I could see dropdown for selection of Employment status
    And I select employed from dropdown
    Then I Enter on information box field for income per year
    Then click to Next Question for entering kiwisaver Balance
    Then I Enter on information box field for Kiwisaver Balance
    Then click to Next Question for selecting contribution rate
    And I could see dropdown for selection of Contribution rate
    Then I select rate from the options
    And I could see dropdown for selection of Type of fund
    Then I select fund type from the options
    And I could see estimated balance
