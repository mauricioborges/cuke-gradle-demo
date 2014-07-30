import static cucumber.api.groovy.EN.*
import geb.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)
this.metaClass.mixin(geb.Browser)




import cucumber.api.PendingException

Given(~/^the input "(.*?)"$/) { String arg1 ->
    browser.go("http://www.google.com?q=$arg1")
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}


