$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("home.feature");
formatter.feature({
  "line": 2,
  "name": "Home Test",
  "description": "As user I want to login goldencharter website",
  "id": "home-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 5625027200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify user should navigate to funeralplan page successfully",
  "description": "",
  "id": "home-test;verify-user-should-navigate-to-funeralplan-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I accept cookie",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on OurFuneralplans link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to funeralplans page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 132349300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAcceptCookie()"
});
formatter.result({
  "duration": 473085600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnOurFuneralplansLink()"
});
formatter.result({
  "duration": 630700000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToFuneralplansPageSuccessfully()"
});
formatter.result({
  "duration": 131992300,
  "status": "passed"
});
formatter.after({
  "duration": 756482600,
  "status": "passed"
});
});