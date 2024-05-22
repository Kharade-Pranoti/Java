package com.app.dao;

import org.hibernate.*;
import javax.persistence.*;
import java.util.List;
import com.app.entities.*;

// BlogPostDao interface for post
public interface BlogPostDao {

	// A method to create a new post
	String createBlogPost(String title, String content, String description);
	
	// A method to display all post
	List<BlogPost> displayAllPost();
	
	// A method to display a specific post by it's title.
	BlogPost displaySpecificPost(String title);
}
