Feature: New magazine visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Tap on Post Flip
    Given Go to Daily Edition
    Then Tap on Post
    Then Tap on Post
    Then Tap on Post Flip
    Then Create Magazine
    Then fill Name Your Magazine Field
    Then fill Desc Your Magazine Field
    Then click Private Button