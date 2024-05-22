package com.app.entities;

import org.hibernate.*;
import javax.persistence.*;

@Entity(name = "blogpost")
public class BlogPost {

	// all the state of hibernate pojo class must be serializable
	
	// @GeneratedValue annotation makes the postId as a id primary key
	// and this id is generated automatically
	// Long wrapper class implements Serializable
	// If we use primitive long then nothing happens, compiler will do
	// autoboxing -- long(primitive) --> Long(Wrapper)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long postId;
	
	// the name attribute of column represents what name will appear in the
	// database. And the length represents the total length content can have.
	@Column(name = "content", length = 100)
	private String content;
	
	@Column(name = "description", length = 60)
	private String description;
	
	// the unique attribute=true represents that title column will have
	// unique values
	@Column(name = "title", length = 20, unique = true)
	private String title;
	
	// default constructor
	public BlogPost() {
		
	}

	// parametrized constructor
	public BlogPost(Long postId, String title, String content, String description) {
		super();
		this.postId = postId;
		this.title = title;
		this.content = content;
		this.description = description;
	}
	
	public BlogPost(String title, String content, String description) {
		super();
		this.title = title;
		this.content = content;
		this.description = description;
	}

	// getters and setters
	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "BlogPost [postId=" + postId + ", content=" + content + ", description=" + description + ", title="
				+ title + "]";
	}
	
	
	
}
