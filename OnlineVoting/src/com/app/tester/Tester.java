package com.app.tester;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

import com.app.dao.UserDaoImpl;
import com.app.dao.UserDao;
import com.app.core.User;

public class Tester {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			// create instance of the dao implementation class
			UserDaoImpl userDao = new UserDaoImpl();
		
			boolean exit = false;
			
			while(!exit) {
				System.out.println("1. Login \n" + "2. Show users between a particular date \n" +
			"3. Change Password \n"+ "4. User Registration" + "0. Exit");
				
				try {
					switch(sc.nextInt()) {
					
					case 1: // user login
						System.out.println("Enter your Email and Password");
						String user = userDao.userLogIn(sc.next(), sc.next());
						if (user != null)
							System.out.println("Login successful");
						else
							System.out.println("Invalid email or password");
						break;
						
						
//					case 2: // user sign-up
//						System.out.println("Enter your details - First name, Last name, email, password,"
//								+ "date of birth");
//						User signup = userDao.userSignUp(sc.next(), sc.next(), sc.next(), sc.next(), Date.valueOf(sc.next()), "VOTER");
//						System.out.println("You're successfully signed up.");
						
					case 2: // user infornmation from begin and end date
						System.out.println("Enter the begin date and the end date.");
						List<User> userDetails = userDao.userInfo(Date.valueOf(sc.next()), Date.valueOf(sc.next()));
						System.out.println("The users between the given dates are: ");
						userDetails.forEach(i -> System.out.println(i));
						break;
						
					case 3: // change the password
						System.out.println("Enter your email, old password and new password:");
						String msg =userDao.changePassword(sc.next(), sc.next(), sc.next());
						System.out.println(msg);
						break;
						
					case 4: // add a new user - user registration
						System.out.println("Thank you for registering with us.");
						System.out.println("Please enter your details as follows - first name, last name,"
								+ " email, password, date of birth ");
						User userReg = new User (sc.next(), sc.next(), sc.next(), sc.next(), 
								Date.valueOf(sc.next()));
						System.out.println(userDao.voterReg(userReg));
						
					case 0: // exit
						break;
					
					}
				}
				catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		
		}

	}

}
