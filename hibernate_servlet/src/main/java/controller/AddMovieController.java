package controller;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.dao.MovieDao;
import model.entity.Movie;
@WebServlet("/addMovie")
@MultipartConfig
public class AddMovieController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		Double rating = Double.parseDouble(req.getParameter("rating"));
		String releaseDate = req.getParameter("dor");
		
		Part part = req.getPart("image");
		
		InputStream is = part.getInputStream();
		byte[] image = is.readAllBytes();
		
		is.close();
		
		Movie m = new Movie(name,rating,LocalDate.parse(releaseDate),image);
		
		MovieDao dao = new MovieDao();
		
		RequestDispatcher rd = req.getRequestDispatcher("add_movie.jsp");
		
		if(dao.addMovie(m)) {
			req.setAttribute("msg", "movie added successfully");
		}else {
			req.setAttribute("msg", "failed to add movie");
		}
		
		rd.forward(req, resp);
	}

}
