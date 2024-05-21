package com.app.dao;

import com.app.core.*;
import java.sql.*;
import java.util.List;

public interface UserDao {

	// sign-in 
	User signIn(String email, String password) throws SQLException;
	
	// to display user details
	User displayUserDetails(int voterId) throws SQLException;
	
	// to display the user between given start date and end date
	List<User> userDetails(Date startDate, Date endDate) throws SQLException;
	
	// for voter registration
	String voterRegistration(User newVoter) throws SQLException;
	
	// to update a password
	String changePassword(String email, String oldPassword, String newPassword) throws SQLException;
	
	// delete voter details
	String deleteVoterDetails(int voterId) throws SQLException;
	
	// to update voting status
	String updateVotingStatus(int voterId) throws SQLException;
	
}
