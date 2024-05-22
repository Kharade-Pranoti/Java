package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;
import java.util.Scanner;
import org.hibernate.SessionFactory;

import com.app.dao.BlogPostDao;
import com.app.dao.BlogPostDaoImpl;
import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;

public class CreateBlogPost {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); 
			Scanner sc = new Scanner(System.in)) {
			
			// create blog post dao instance
			BlogPostDao postDao = new BlogPostDaoImpl();
			
			System.out.println("Enter post title, content, description");
			System.out.println(postDao.createBlogPost(sc.next(),
					sc.next(),sc.next()));
			
		} // JVM sf.close() => cleaning up of DBCP
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
