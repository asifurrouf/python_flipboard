Feature: readers mood works properly

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Tap on Post Readers view
    Given Go to Daily Edition
    Then Tap on Post
    Then Tap on Post
    Then Tap on Post Reader View
