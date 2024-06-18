Feature:Login Failure
  Background:
    Given User launch Gmail application


@smoke
Scenario Outline: wrong password
  When Enters Email  "<Email>"
  And Enters Password  "<Password>"
  Examples:
    | Email              | Password |
    | darlingdarling7799 |12346789  |

  @smoke
Scenario Outline: wrong email
    When Enters Email  "<Email>"
    Examples:
      | Email |
      | ssse  |

  @smoke
  Scenario Outline: Empty email
    When Enters Email  "<Email>"
    Examples:
      | Email |
      |       |
