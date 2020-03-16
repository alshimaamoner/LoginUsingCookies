import javax.servlet.*;
import java.io.*;
import java.util.Enumeration;
import javax.servlet.http.*;

public class Welcome extends HttpServlet{
	
	PrintWriter out;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		out = response.getWriter();
         Cookie c[]=request.getCookies(); 
        out.print("Name: "+c[0].getValue()); 
        out.print("Password: "+c[1].getValue());
		out.println("<font size='30'>Logged in successfully. Welcome!</font>");
	}
	

}





