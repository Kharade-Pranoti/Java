package com.app.tester;

import org.hibernate.*;
import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

import com.app.entities.*;
import com.app.dao.BlogPostDao;
import com.app.dao.BlogPostDaoImpl;
import static com.app.utils.HibernateUtils.getFactory;

public class DisplayAllPost {

	public static void main(String[] args) {
		try(SessionFactory sf = getFactory();
			Scanner sc = new Scanner(System.in)){
			
			BlogPostDao allPost = new BlogPostDaoImpl();
			
			System.out.println("All the blog post are as follows :");
			allPost.displayAllPost().forEach(System.out::println);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
