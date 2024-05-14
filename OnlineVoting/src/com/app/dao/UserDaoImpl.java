package com.app.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.app.utils.DatabaseUtils.openConnection;
import com.app.core.*;
import static com.app.utils.DatabaseUtils.closeConnection;


public class UserDaoImpl implements UserDao {
	
	// state
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3, pst4, pst5;
	
	// def ctor
	public UserDaoImpl() throws SQLException {
		// open the connection
		cn = openConnection();
		
		// for login
		pst1 = cn.prepareStatement("select * from users where email=? and password=?");
		
		// for user sign-up (create an account)
		//pst2 = cn.prepareStatement("insert into users values (?,?,?,?,?)");
		
		// to show the details of user between the born dates
		pst3 = cn.prepareStatement("select * from users where dob between ? and ?");
		
		// to change the voter's password
		pst4 = cn.prepareStatement("update users set password=? where email=? and password=?");
		
		// to add new voter
		pst5 = cn.prepareStatement("insert into users values (default, ?,?,?,?,?,?,?)");
	}
	
	// method for user login
	@Override
	public String userLogIn(String email, String password) throws SQLException{
		// set IN param
		pst1.setString(1, email);
		pst1.setString(2, password);
		
		// executing query and storing it in the result set - rst
		// iterating through the data - if entered details found in the data - matched
		try(ResultSet rst = pst1.executeQuery()){
			if (rst.next())
				return new User(rst.getString(2), rst.getString(3)) + "login successful";
		}
		return null;
		
	}
	
	/*
	 * int userId, String firstName, String lastName, String email, String password,
			boolean status, Date birthDate
	 */
//	@Override
//	public User userSignUp(String firstName, String lastName, String email, String password,
//			Date birthDate) throws SQLException{
//		// set IN parameters
//		pst2.setString(2, firstName);
//		pst2.setString(3, lastName);
//		pst2.setString(4, email);
//		pst2.setString(5, password);
//		pst2.setDate(7, birthDate);
//		
//		ResultSet rst = pst2.executeQuery();
//		return new User (rst.getString(2), rst.getString(3), rst.getString(4),
//				rst.getString(5), rst.getDate(7));
//	}
	
	// to get the details of the user born between the particular dates
	public List<User> userInfo(Date begin, Date end) throws SQLException{
		// create empty arraylist to store the details 
		List<User> users = new ArrayList<>();
		
		// set IN parameters
		pst3.setDate(1, begin);
		pst3.setDate(2, end);
		
		try(ResultSet rst = pst3.executeQuery()){
			while(rst.next()) {
				users.add(new User (rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getBoolean(6), rst.getDate(7), rst.getString(8)));
			}
		}
		return users;
	}
	
	
	// to set the voter's new password
	public String changePassword(String email, String oldPassword, String newPassword) throws SQLException{
		// set IN parameters
		pst4.setString(2, email);
		pst4.setString(3, oldPassword);
		pst4.setString(1, newPassword);
		
		// PreparedStatement -> update -> executeUpdate
		// when the update is done the row count is 1 if matching is not found then it returns 0.
		int rows = pst4.executeUpdate();
		if(rows == 1)
			return "Your password has been changed successfully!";
		return "Please enter your email and old password correctly to change the password.";
	}
	
	// to add a new voter
	public String voterReg (User newVoter) throws SQLException{
		// set In Parameters
		/*
		 * String firstName, String lastName, String email, String password, boolean status,
			Date birthDate, String role
		 */
		pst5.setString(1, newVoter.getFirstName());
		pst5.setString(2, newVoter.getLastName());
		pst5.setString(3, newVoter.getEmail());
		pst5.setString(4, newVoter.getPassword());
		pst5.setBoolean(5, newVoter.isStatus());
		pst5.setDate(6, newVoter.getBirthDate());
		pst5.setString(7, newVoter.getRole());
		
		// as we are going to add a user into the users table..so the table is going to get updated
		// so here we will use the executeUpdate()
		int rows = pst5.executeUpdate();
		if (rows == 1)
			return "Voter Registered";
		return "Voter didn't get registered";
		
	}
	
	
	// closing the connections
	public void cleanUp() throws SQLException {
		System.out.println("user dao cleaned up..");
		// closing the instance of the PreparedStatement
		if (pst1 != null)
			pst1.close();
		
		// closing the db connection
		closeConnection();
	}

}
