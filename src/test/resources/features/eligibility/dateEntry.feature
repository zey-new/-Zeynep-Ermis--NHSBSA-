
Feature: DateBoxes functionality

  Background:
    Given I am on the DoB page

  Scenario: date entry with valid entries

    When I fill the DoB fields

      | DoB day   | 12    |
      | DoB month | 6    |
      | DoB year  | 1980 |

    Then I should navigate the partner page

  Scenario: date entry with invalid length
    When I fill the DoB fields

      | DoB day   | 20  |
      | DoB month | 30   |
      | DoB year  | 1980 |

    Then I should get warning message "Enter your date of birth"

  Scenario: date entry with invalid data type
    When I fill the DoB fields

      | DoB day   | DD   |
      | DoB month | 03   |
      | DoB year  | 1980 |

    Then I should get warning message "Enter your date of birth"

  Scenario: date entry with empty box
    When I fill the DoB fields

      | DoB day   | 13 |
      | DoB month | 10 |
      | DoB year  | 13 |

    Then I should get warning message "Check the year you were born is correct"


  Scenario: date entry with invalid dateRange
    When I fill the DoB fields

      | DoB day   | 13     |
      | DoB month | 12     |
      | DoB year  | 198080 |

    Then I should get warning message "Your date of birth must be in the past"


  Scenario Outline: date boundary analysis
    When I enter a date for <age>
    Then I should land following "<page>"
    Examples:
      | age | page                |
      | 0   | /result-under-16     |
      | 15  | /result-under-16     |
      | 16  | /full-time-education |
      | 18  | /full-time-education |
      | 19  | /partner             |
      | 120 | /partner             |
      | 121 | /date-of-birth       |
