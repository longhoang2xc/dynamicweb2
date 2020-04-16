package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import model.User;

/**
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 */

@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

	public void init() {
		userDAO = new UserDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,  IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		try {
			switch (action) {
			case "/new":
				showNewForm(request,response);
				break;

			default:
				listUsers(request, response);
				break;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void listUsers(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> listUsers = userDAO.selectAllUsers();
		request.setAttribute("listUsers", listUsers);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Users.jsp");
		dispatcher.forward(request, response);
	}
	
	// TO-DO: Implement showNewForm() method which navigates to ADD USER view
	// (add-user.jsp)
	@SuppressWarnings("unused")
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("add-user.jsp");
		dispatcher.forward(request, response);
	}

	// TO-DO: Implement showEditForm() method which navigates to UPDATE USER view
	// (edit-user.jsp)
	@SuppressWarnings("unused")
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

	}

	// TO-DO: Implement insertUser() method for adding new user
	@SuppressWarnings("unused")
	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		
		User newUser = new User(name, address, mobile);
		userDAO.insertUser(newUser);
		
		response.sendRedirect("list");
	}

	// TO-DO: Implement updateUser() method for updating existing user
	@SuppressWarnings("unused")
	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

	}

	// TO-DO: Implement deleteUser() method for deleting existing user
	@SuppressWarnings("unused")
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

	}
}
