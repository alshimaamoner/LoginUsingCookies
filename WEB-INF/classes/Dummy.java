import javax.servlet.*;
import java.io.*;
import java.util.Enumeration;
import javax.servlet.http.*;

public class Dummy extends HttpServlet{
	
	PrintWriter out;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");

		out = response.getWriter();
        Cookie[] cookies = request.getCookies();

        if(cookies != null) 
        {
        
        out.print("Name: "+cookies[0].getValue()); 
        out.print("Password: "+cookies[1].getValue());
           
         response.sendRedirect("login");

        }else{
            response.setContentType("text/html");
			out = response.getWriter();
			out.println("<label color='red'>cookie closed</label>");
        }
        
       /* if(c!=null){
         out.print("Name: "+c[0].getValue()); 
         out.print("Password: "+c[1].getValue());
		out.println("<font size='30'>Logged in successfully. Welcome!</font>");
        }else{
                        
            response.setContentType("text/html");
			out = response.getWriter();
			out.println("<label color='red'>cookie closed</label>");

        }
        */
	}
	

}





