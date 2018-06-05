#Author: gzduran@bancolombia.com.co
Feature: Youtube
  As a Web User  
  I want to use Youtube
  to watch videos and listen to music

  Scenario: Search my favorite song
    Given that Lauren opens her browser at Google Home Page
    And She goes to Youtube
    When She searches the song A Thousand Years
    Then She should see at least 1 video listed
