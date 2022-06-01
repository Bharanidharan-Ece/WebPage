package login_page;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	
    	PrintWriter out = response.getWriter();
    	response.setContentType("text/html");

        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        LoginBean loginBean = new LoginBean(uname,upwd);
        loginBean.setUsername(uname);
        loginBean.setPassword(upwd);
        System.out.println("Ser"+uname);
        System.out.println("Ser"+upwd);

        try {
        	
        	LoginBean user = new LoginBean(uname, upwd);
            user.setUsername(request.getParameter("un"));
            user.setPassword(request.getParameter("pw"));
            
            
            if (loginDao.validate(loginBean)) {
            	
            	HttpSession session = request.getSession();	    
                session.setAttribute("currentSessionUser",uname); 
                response.sendRedirect("loginsuccess.jsp");

            } else {
            	out.println("<html><body><div><font size ='5'color ='red'>Sorry User name or passsword is wrong</font></div></body></html>");
            	RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            	rd.include(request, response);
            	
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}