@eligibility
Feature:Eligibility checker

  Scenario: Elder people with partner, having benefits tax credit,
  paid universal credit, child benefit and take home pay
    Given I am a person from "Wales"
    When I fill the DoB fields

      | DoB day   | 30   |
      | DoB month | 01   |
      | DoB year  | 1930 |


    And based on following criteria
      | w/o partner                               | yes |
      | benefits/u tax credits                    | yes |
      | paid/u/else universal credit              | yes |
      | child, LCW or LCWRA with universal credit | yes |
      | take home pay                             | yes |


    And fill out partner page
    And fill out tax credits page
    And fill out universal credit page
    And child,LCW or LCWRA
    And take home pay

    Then I should get a result message saying that "you get help paying NHS costs"
