package com.app.tester;

import org.hibernate.*;
import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

import com.app.entities.*;
import com.app.dao.BlogPostDao;
import com.app.dao.BlogPostDaoImpl;
import static com.app.utils.HibernateUtils.getFactory;

public class DisplaySpecificPost {

	public static void main(String[] args) {
		try(SessionFactory sf = getFactory();
				Scanner sc = new Scanner(System.in)){
			
			BlogPostDao specificPost = new BlogPostDaoImpl();
			
			System.out.println("Enter the post title..");
			
			System.out.println(specificPost.displaySpecificPost(sc.next()));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
