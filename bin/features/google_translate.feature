#Author: gzduran@bancolombia.com
Feature: Google Translate
  As a web user
  I want to use Google Translate
  To translate words between different languages

@EnglishtoSpanish
  Scenario: Translate from Spanish to English
    Given that Glendy opens her browser at Google Home Page
    And She goes to Google Translate
    When She translate the word wolf from English to Spanish
    Then She should see the word lobo in the screen

@JapanesetoKorean
Scenario: Translate from Japanese to Korean
    Given that Glendy opens her browser at Google Home Page
    And She goes to Google Translate
    When She translate the word 狼 from Japanese to Korean
    Then She should see the word 늑대 in the screen