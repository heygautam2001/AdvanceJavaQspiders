package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieLogout")

public class CookieLogout  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] cookies = req.getCookies();
		
		if(cookies != null) {
			
			for(Cookie c : cookies) {
				c.setMaxAge(10); // after 10 second the cookies will be destroyed
				resp.addCookie(c);
				}
			
	}
		
		PrintWriter pw = resp.getWriter();
		pw.println("You have been logges out");
		resp.setContentType("text/html");
		pw.println("<a href = 'cookieView'>view Profile</a>");
		
		
	}

}
