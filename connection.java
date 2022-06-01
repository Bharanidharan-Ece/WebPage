package sql_connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/register")
public class connection extends HttpServlet{
	
	//create the query
	private static final String INSERT_QUERY ="INSERT INTO USER(uname,uemail,upwd,unumber,dob) VALUES(?,?,?,?,?)";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter
		PrintWriter pw = res.getWriter();
		//set Content type
		res.setContentType("text/hmtl");
		//read the form values
		String uname = req.getParameter("uname");
		String uemail = req.getParameter("uemail");
		String upwd = req.getParameter("upwd");
		String unumber = req.getParameter("unumber");
		String dob = req.getParameter("dob");
		//load the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//create the connection
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Webapplication","root","Mec170248@");
				PreparedStatement ps = con.prepareStatement(INSERT_QUERY);){
			//set the values
			ps.setString(1, uname);
			ps.setString(2, uemail);
			ps.setString(3, upwd);
			ps.setString(4, unumber);
			ps.setString(5, dob);
			
			//execute the query
			int count = ps.executeUpdate();
			
			if(count==0) {
				HttpSession session = req.getSession();	
				pw.println("Record not stored into database");
			}else {
				
				res.sendRedirect("sucess_signUp.jsp");
				
            	
			}
		}catch(SQLException se) {
			pw.println(se.getMessage());
			se.printStackTrace();
		}catch(Exception e) {
			pw.println(e.getMessage());
			e.printStackTrace();
		}
		
		//close the stream
		pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}