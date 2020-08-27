package com.sn.diary;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  long id;

	public void setContent(String content) {
		this.content = content;
	}

	private  String content;


	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
