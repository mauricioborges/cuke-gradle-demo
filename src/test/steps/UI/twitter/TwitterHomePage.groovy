import geb.Browser
import geb.Page
import geb.Module

class TwitterHomePage extends Page {
 
    // pages can define their location, either absolutely or relative to a base
    static url = "https://twitter.com/nerdioculos"
 
    // “at checkers” allow verifying that the browser is at the expected page
    static at = { title == "Mauricio Silva (nerdioculos) on Twitter"
 }
 
    static content = {
        // include the previously defined module
        search { $(~/nav-search/).click() }
        query { $("search-input") }
        closeLoginPage { $("button").click() }
    }
}
