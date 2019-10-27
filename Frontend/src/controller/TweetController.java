package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Tweet;

@ManagedBean(name = "tweetcontroller")
@SessionScoped
public class TweetController {
@ManagedProperty(value="#{tweet}")
	private Tweet tweet;


public Tweet getTweet() {
	return tweet;
}


public void setTweet(Tweet tweet) {
	this.tweet = tweet;
}


public void addNewTweet()
{
	System.out.println("is in use");
}
}
