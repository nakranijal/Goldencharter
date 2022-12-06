@regression
Feature: Home Test
  As user I want to login goldencharter website


  Scenario: Verify user should navigate to funeralplan page successfully
    Given I am on homepage
    And I accept cookie
    When I click on OurFuneralplans link
    Then I should navigate to funeralplans page successfully
