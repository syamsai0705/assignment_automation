Feature:Compose Email Functionality in Gmail
Background:
    Given User launch Gmail application
    And Enters Email as "darlingdarling7799" and Password as "Chowdary@66"

  @smoke
  Scenario Outline: Successfully send an email with valid subject and body
    When Clicks on the Compose button
    And Enters "<EmailID>" in the To field
    And Enters "<subject>" in the field
    And Enters "<Body>" in the body field
    And Click Send
    And View the Message
  Examples:
    | EmailID               | subject  | Body                            |
    | syamsai0705@gmail.com | Incubyte | Automation QA test for Incubyte |

  @smoke
  Scenario Outline: Send an email without a subject
    When Clicks on the Compose button
    And Enters "<EmailID>" in the To field
    And Leaves the subject field empty
    And Enters "<Body>" in the body field
    And Click Send
    And View the Message
    Examples:
      | EmailID               | Body                            |
      | syamsai0705@gmail.com | Automation QA test for Incubyte |


  @smoke
  Scenario Outline: Send an email without a body
    When Clicks on the Compose button
    And Enters "<EmailID>" in the To field
    And Enters "<subject>" in the field
    And Leaves the body field empty
    And Click Send
    And View the Message
    Examples:
      | EmailID               | subject  |
      | syamsai0705@gmail.com | Incubyte |



  @smoke
  Scenario Outline: Send an email without a recipient
    When Clicks on the Compose button
    And Leaves the To field empty
    And Enters "<subject>" in the field
    And Enters "<Body>" in the body field
    And Click Send
Examples:
  | subject  | Body                            |
  | Incubyte | Automation QA test for Incubyte |




