Feature: readers mood works properly

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Profile
    Given click on Profile Button