Feature: New magazine visible


  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button


  @initial
  Scenario: Tap on "Flip"
    Given click on more
    Then Tap on Flip
    Then Create Magazine
    Then fill Name Your Magazine Field
    Then fill Desc Your Magazine Field
    Then click Private Button