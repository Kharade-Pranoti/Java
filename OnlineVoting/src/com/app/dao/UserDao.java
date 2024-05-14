package com.app.dao;

import java.sql.*;
import java.util.*;
import java.sql.Date;

import com.app.core.*;

// User DAO Interface
public interface UserDao {

	// user login
	String userLogIn(String email, String password) throws SQLException;
	
	// user sign-up (create a new account)
//	User userSignUp(String firstName, String lastName, String email, String password,
//			  Date birthDate) throws SQLException;
	
	// to show user details born between a particular dates
	// as it will give us the list of the user the type of the method will be the list
	List<User> userInfo(Date beginDate, Date endDate) throws SQLException;
	
	// update voter's password
	String changePassword(String email, String oldPassword, String newPassword) throws SQLException;
	
	// voter's registration
	String voterReg (User newVoter) throws SQLException;
}
