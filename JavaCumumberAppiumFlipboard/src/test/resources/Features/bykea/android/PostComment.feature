Feature: comment visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Tap on Post comment
    Given Go to Daily Edition
    Then Tap on Post
    Then Tap on Post
    Then Tap on Post Comment
    Then click on Post Comment Field
    Then Fill Comment on Post Comment Field