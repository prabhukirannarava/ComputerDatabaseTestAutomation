Feature: As a valid user, he/she should be able to add a computer to computer database.

  Scenario Outline: Validate add computer page by giving different inputs
    Given Computer database portal is open
    When User clicks on Add a new computer button
    Then Add Computer page should be opened
    When User fills in "<ComputerName>"
    And Introduced Date is entered as "<IntroducedDate>"
    And Discontinued date is entered as "<DiscontinuedDate>"
    And Company name is selected as "<CompanyName>"
    When User clicks on Create this computer Button
    Then Create computer should "<CreateResult>" successful
    Examples: below is the test data
      | ComputerName    | IntroducedDate | DiscontinuedDate | CompanyName            | CreateResult |
      | AMSKLpnarava123 | 2018-12-12     | 2017-10-01       | IBM                    | Be           |
      | AMSKLpnarava321 |                | 2017-10-01       | Xerox                  | Be           |
      | AMSKLpnarava456 | 2015-03-04     |                  | Xerox                  | Be           |
      | Bahubali        | 2015-03-04     | 2017-10-01       | -- Choose a company -- | Be           |
      | Mac45321        | 13-12-10       | 22-10-01         | Xerox                  | Be           |
      |                 | 2013-12-10     | 2017-10-01       | RCA                    | Not be       |
      | Windows123      | 2013-12-10     | daskfdfj         | RCA                    | Not be       |