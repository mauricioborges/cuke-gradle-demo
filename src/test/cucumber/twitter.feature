Feature: Hashtag filtering

	Scenario: Procurar uma hashtag que existe
	    Given that I want to search for tweets related to an existing hashtag
	    When I search for the chosen hashtag
	    Then I get a list of related tweets
