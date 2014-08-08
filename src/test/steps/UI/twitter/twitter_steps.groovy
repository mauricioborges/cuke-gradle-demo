import static cucumber.api.groovy.EN.*
import geb.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)
this.metaClass.mixin(geb.Browser)




import cucumber.api.PendingException


Given(~/^that I want to search for tweets related to an existing hashtag$/) { ->
	Browser.drive{
		to TwitterHomePage
		assert at(TwitterHomePage)
		closeLoginPage
	}
}

When(~/^I search for the chosen hashtag$/) { ->
    // Write code here that turns the phrase above into concrete actions
	Browser.drive{
		query.value("#TRILHATESTES")
		search
	}
}

Then(~/^I get a list of related tweets$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

