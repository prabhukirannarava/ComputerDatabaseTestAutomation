Feature: As a vald user, he/she should be able to filter the computers list successfuly

  Scenario Outline: Validate filtering functionality
    Given Computer database portal is open and atleast one computer details present on computer database portal
    When Computer name is entered as "<computerName>"
    And User clicks on fliterByName button
    Then Filtering should "<result>" and home page should display "<resultSet>" list.
    Examples: below is the test data
      | computerName | result  | resultSet |
      | AMSKL        | Success | AMSKL     |
