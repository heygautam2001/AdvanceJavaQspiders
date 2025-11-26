package controller;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MovieDao;
import model.entity.Movie;

@WebServlet("/fetchImage")
public class FetchMovieImageController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		MovieDao dao = new MovieDao();
		Movie m = dao.findMovieById(id);
		
		byte[] image = m.getImage();
				
		resp.setContentType("image/jpeg");
		OutputStream os = resp.getOutputStream();
		
		os.write(image);
		
		os.close();
		
	}

}
