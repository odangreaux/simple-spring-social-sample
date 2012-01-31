package grails.plugin.simplespringsocial.sample

import org.springframework.social.facebook.api.Facebook
import org.springframework.social.twitter.api.Twitter

class AuthenticationController {
	static layout = 'main'

	Facebook facebook
	Twitter twitter

    def index() { }

	def facebookLoginSuccess = {
		def userId = facebook.userOperations().getUserProfile().id
		def userName = facebook.userOperations().getUserProfile().firstName
		[userId:userId, userName:userName]
	}

	def twitterLoginSuccess = {
		def userId = twitter.userOperations().getUserProfile().screenName
		def userName = twitter.userOperations().getUserProfile().name
		[userId:userId, userName:userName]
	}
}
