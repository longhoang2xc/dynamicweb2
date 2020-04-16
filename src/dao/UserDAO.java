package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.User;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provides 
 * CRUD (CREATE - READ - UPDATE - DELETE) database operations 
 * for the table user in the database
 */
public class UserDAO {

	public UserDAO() {
	}

	public List<User> selectAllUsers() {

		List<User> users = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_USERS = "SELECT * FROM users";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String mobile = rs.getString("mobile");
				users.add(new User(id, name, address, mobile));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
	
	// TO-DO: Implement selectUser() method to select user by ID (use in UPDATE function)
	public User selectUser(int id) {
		User user = null;
		return user;
	}

	// TO-DO: Implement insertUser() method to add new record to table User  
	public void insertUser(User users) throws SQLException {

		Connection connection = DBConnect.getConnection();
		try {
			String INSERT_USER = "INSERT INTO users (name,address,mobile) VALUES (?,?,?);" ;
			PreparedStatement ps = connection.prepareStatement(INSERT_USER);
			ps.setString(1, users.getName() );
			ps.setString(2, users.getAddress() );
			ps.setString(3, users.getMobile() );
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// TO-DO: Implement updateUser() method to update record in table User  
	public boolean updateUser(User user) throws SQLException {
		boolean rowUpdated = false;

		return rowUpdated;
	}

	// TO-DO: Implement deleteUser() method to delete record in table User  
	public boolean deleteUser(int id) throws SQLException {
		boolean rowDeleted = false;

		return rowDeleted;
	}
}
