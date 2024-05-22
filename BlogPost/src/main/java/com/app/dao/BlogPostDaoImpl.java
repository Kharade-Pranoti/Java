package com.app.dao;

import java.util.List;
import static com.app.utils.HibernateUtils.getFactory;
import com.app.entities.BlogPost;
import org.hibernate.*;

public class BlogPostDaoImpl implements BlogPostDao{

	@Override
	public String createBlogPost(String title, String content, String description) {
		BlogPost newPost = null;
		String msg = "Unfortunately, your blog wasn't created due to some issue";
		
		// get session from SessionFactory
		Session session = getFactory().getCurrentSession();
		
		// begin the transaction
		Transaction tx = session.beginTransaction();
		
		// JPQL Query
		String jpql = "insert into BlogPost values(post.title = :tile,"
				+ "post.content = :content, post.description = :description)";
		
		// CRUD operation
		try {
			newPost = session.createQuery(jpql, BlogPost.class)
					.setParameter("title", title) //1st param
					.setParameter("content", content) // 2nd param
					.setParameter("description", description)
					.getSingleResult();
			tx.commit();
			
			// => post created successfully
			msg = "Your blog post created successfully!";
			
		}catch (RuntimeException e) {
			tx.rollback();
			throw e;
		}
		
		return msg;
	}

	@Override
	public List<BlogPost> displayAllPost() {
		List<BlogPost> allPosts = null;
		
		// get the session
		Session session = getFactory().getCurrentSession();
		
		// begin the transaction
		Transaction tx = session.beginTransaction();
		
		// JPQL Query
		String jpql = "select post from BlogPost post";
		
		// CRUD OPERATION
		try {
			allPosts = session.createQuery(jpql, BlogPost.class)
					.getResultList();
			
			tx.commit();
		}
		catch(RuntimeException e) {
			tx.rollback();
			throw e;
		}
		return allPosts;
	}

	@Override
	public BlogPost displaySpecificPost(String title) {
		BlogPost post = null;
		
		// get the session
		Session session = getFactory().getCurrentSession();
				
		// begin the transaction
		Transaction tx = session.beginTransaction();
				
		// JPQL Query
		String jpql = "select post from BlogPost post where post.title= :title";
				
		// CRUD OPERATION
		try {
			post = session.createQuery(jpql, BlogPost.class)
					.setParameter("title", title)
					.getSingleResult();
					
			tx.commit();
		}
		catch(RuntimeException e) {
			tx.rollback();
		throw e;
		}
			
		return post;
	}

}
