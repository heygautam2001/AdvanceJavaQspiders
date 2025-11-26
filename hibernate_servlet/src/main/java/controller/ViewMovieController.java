package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MovieDao;
import model.entity.Movie;

@WebServlet("/viewMovie")
public class ViewMovieController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		MovieDao dao = new MovieDao();
		Movie m = dao.findMovieById(id);
		
		RequestDispatcher rd = req.getRequestDispatcher("view_movie.jsp");
		
		if(  m != null) {
			req.setAttribute("movie", m);
		}else {
			req.setAttribute("msg", "movie with provided id does not exists");
		}
		
		
		rd.forward(req, resp);
		
	}

}
