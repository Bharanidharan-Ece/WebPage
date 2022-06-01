package login_page;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		String name = request.getParameter("profile");
		out.print("<html><body style = 'background-color:#F7CAC9' background-image:url(images1/3.jpg)>");
		out.println("<div align = 'center'>");
		out.println("<h3><font size =\"5\"color =\"BLACK\">User Record</font></h3>");
		out.print("<table border = '5'>");
		System.out.println(name);
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Webapplication","root","Mec170248@");
			String user_data = "select * from user where uemail='"+name+"'";
			//System.out.println(user_data);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(user_data);
			System.out.println(rs);
			while(rs.next())
			{
				out.print("<tr><td>");
				out.print("Name             :       ");
				out.println(rs.getString(2));
				out.print("</td></tr><tr><td>");
				out.print("Email             :      ");
				out.println(rs.getString(3));
				out.print("</td></tr><tr><td>");
				out.print("Number            :      ");
				out.println(rs.getString(5));
				out.print("</td></tr><tr><td>");
				out.print("Date of Birth     :      ");
				out.println(rs.getString(6));
				out.print("</td></tr>");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	
	out.println("</table><br><br>");
	out.println("<a href='www.google.com'></a>");
	out.println("<a href='loginsuccess.jsp'>Back to Home Page</a>");
	out.println("</div>");
	}
}
