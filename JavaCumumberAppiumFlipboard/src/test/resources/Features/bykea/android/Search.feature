Feature: Search

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Search
    Given click on Search Button
    Then click on Search Field
    Then Fill text on Search Field
