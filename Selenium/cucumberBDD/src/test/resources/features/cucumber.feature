Feature: Login Functionality

    Using this Feature we will check the loin functionality by passing multiple credentials

    Scenario Outline: hitting the specified login URL
        Given The login page link enter into that link
        When User Enters the username: "<username>" and password: "<password>"
        And Start to type your And step here Click on login button
        Then User loggged into page or he will get the error message like "<errorM>"

        Examples:
            | username | password  | errorM |
            | hello4  | 123hello  | Warning: No match for E-Mail Address and/or Password.  |
            | hello5  | 123hello  | Warning: No match for E-Mail Address and/or Password.  |
            | hello6  | 123hello  | Warning: No match for E-Mail Address and/or Password.  |
      