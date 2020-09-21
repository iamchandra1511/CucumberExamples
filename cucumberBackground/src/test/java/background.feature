Feature: Sample Cucumber JVM BDD test
  Search Chercher Tech in Google and click first result

	Background: User is Logged In
		Given Open Chrome browser
		Then Navigate to Google Page

	Scenario: Search Google for Chercher Tech
	  Given search for chercher tech

	Scenario: Search Bing for Chercher Tech
	  Given search for selenium cherchertech

	Scenario: Search DuckDuckGo for Chercher Tech
	  Given search for protractor chercher tech