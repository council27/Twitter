package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "Tweet")
@SessionScoped
public class Tweet {
	private  String UserName;
	private String Message;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public TweetEntity getEntity()
	{
		TweetEntity tweetentity = new TweetEntity();
		tweetentity.setUserName(Message);
		tweetentity.setMessage(UserName);
		return tweetentity;
	}

}
