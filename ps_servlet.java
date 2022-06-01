package login_page;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import login_page.LoginServlet;
import login_page.LoginDao;
import login_page.LoginBean;

@WebServlet("/log")
public class ps_servlet extends HttpServlet {
	private static final String UPDATE_USERS_SQL = "update user set upwd=? where uemail =? ";
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter
		PrintWriter pw = res.getWriter();
		//set Content type
		res.setContentType("text/hmtl");
		//read the form values
		String uemail = req.getParameter("uemail");
		String upwd = req.getParameter("upwd");
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Webapplication","root","Mec170248@");
				PreparedStatement ps = con.prepareStatement(UPDATE_USERS_SQL);){
			//set the values
			ps.setString(1, upwd);
			ps.setString(2, uemail);
			
			int count = ps.executeUpdate();
			if(count==0) {
				HttpSession session = req.getSession();	
				pw.println("Password Not Updated");
			}else {
				pw.println("<html><body><div><font size ='5'color ='green'>Password Changed Sucessfully</font></div></body></html>");
            	RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
            	rd.include(req, res);
				res.sendRedirect("home.jsp");
				pw.println("<html><body><div><font size ='5'color ='green'>Password Changed Sucessfully</font></div></body></html>");
            	
			}


}catch(SQLException se) {
	pw.println(se.getMessage());
	se.printStackTrace();
	}
	}
}

