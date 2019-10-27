package model;

import javax.ejb.LocalBean;

@Entity(name = "tweet_tbl");
public class TweetEntity {
@Id
@GenerateValue(strategy=Generation type.AUTO)
private Long id;
private String name;
private String message;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
}
