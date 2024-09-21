@Smoke
Feature: Sample Cucumber Tags
  Scenario: This is a Smoke Tag Scenario
    Given Launch Browser and URL
    And Click on My account
    When Enter the user details
    Then Capture screenshot
    
    @Smoke @Regression

  Scenario: This is a Smoke and Regression Tag Scenario
    Given Launch Browser and URL
    And Click on My account
    When Enter the user details
    Then Capture screenshot
    
    @Smoke @Sanity @Regression

  Scenario: This is a Smoke, Regression and Sanity Tag Scenario
    Given Launch Browser and URL
    And Click on My account
    When Enter the user details
    Then Capture screenshot
    
    @Sanity

  Scenario: This is a Sanity Tag Scenario
    Given Launch Browser and URL
    And Click on My account
    When Enter the user details
    Then Capture screenshot
    
      @Regression
  Scenario: This is Regression Tag Scenario
    Given Launch Browser and URL
    And Click on My account
    When Enter the user details
    Then Capture screenshot