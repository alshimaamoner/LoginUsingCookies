import javax.servlet.*;
import java.io.*;
import java.util.Enumeration;
import javax.servlet.http.*;

public class Login extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out;
		response.setContentType("text/html");
		out = response.getWriter();
		out.println("<FORM method='POST'>");
		out.println("<BR> Username: <INPUT TYPE='TEXT' NAME='userName'>");
		out.println("<BR> Password: <INPUT TYPE='PASSWORD' NAME='password'>");
		out.println("<BR> <INPUT TYPE='SUBMIT' VALUE='Submit'>");
		out.println("</FORM>");
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out;
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");	
        
        Cookie c[]=request.getCookies(); 
        if(c!=null){
            if(userName.equals("shimaa")&& password.equals("123")){
                 Cookie name = new Cookie("username", userName); 
                    response.addCookie(name);
                     Cookie pass = new Cookie("pass", password); 
                     response.addCookie(pass);
                   response.sendRedirect("welcome");
            }
        }else if(c==null){
                    Cookie name = new Cookie("username", "hh"); 
                    response.addCookie(name);
                     Cookie pass = new Cookie("pass", "123"); 
                     response.addCookie(pass);
                     response.sendRedirect("dummy");
          
        }
    }
}
		/*if(userName.equals("shaimaa") && password.equals("123"))
		{
			  response.setContentType("text/html");
			out = response.getWriter();
			out.println("<label color='red'>cookie closed</label>");
		}
		else
		{
			
		}
	}

}





*/