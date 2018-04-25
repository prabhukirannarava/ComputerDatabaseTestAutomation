Feature: As a valid user, he/she should be able to edit,delete computer details

  Scenario Outline: Verify edit computer details funcationality
    Given Computer database portal is open and atleast one computer details present on computer database portal
    When user clicks on a "<ComputerName>"
    And  "<IntroducedDate>","<DiscontinuedDate>", "<CompanyName>", are edited
    Then the details of that computer should be updated

    Examples: below is the test data
      | ComputerName | IntroducedDate | DiscontinuedDate | CompanyName |
      | ACE          | 2020-12-12     | 2027-10-01       | Xerox       |

  Scenario Outline: Verify delete computer functionality
    Given Computer database portal is open and atleast one computer details present on computer database portal
    When user clicks on a "<ComputerName>"
    And user clicks on delete button
    Then deletion should be successful and home page is shown
    Examples: below is the test data
      | ComputerName    |
      | AMSKLpnarava123 |