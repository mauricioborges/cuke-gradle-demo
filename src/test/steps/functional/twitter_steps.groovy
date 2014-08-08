import static cucumber.api.groovy.EN.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

 
	 
import groovyx.net.http.RESTClient
import static groovyx.net.http.ContentType.*

def twitter = new RESTClient( 'https://api.twitter.com/1.1/search/tweets.json' )


def existing_hashtag="#TRILHATESTES"
def hashtag=null
def resp=null

Given(~/^that I want to search for tweets related to an existing hashtag$/) { ->
	hashtag=existing_hashtag
}

When(~/^I search for the chosen hashtag$/) { ->
	resp = twitter.post(
       	 path : 'tweets.json',
       	 body : [ q:hashtag, source:'httpbuilder' ],
       	 requestContentType : URLENC )
 

}
Then(~/^I get a list of related tweets$/) { ->
	assert resp.status == 200
	assert resp.data.text == msg
}

