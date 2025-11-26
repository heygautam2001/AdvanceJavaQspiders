package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MovieDao;
import model.entity.Movie;

@WebServlet("/updateMovie")
public class UpdateMovieController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		double rating = Double.parseDouble(req.getParameter("rating"));
		String releaseDate = req.getParameter("dor");

		MovieDao dao = new MovieDao();
		Movie m = dao.findMovieById(id);

		if (m != null) {
			
			m.setName(name);
			m.setRating(rating);
			m.setReleaseDate(LocalDate.parse(releaseDate));

			dao.updateMovie(m);

			if (m != null) {
				req.setAttribute("msg", "Movie updated successfully");

			} else {
				req.setAttribute("msg", "Failed to update movie");
			}
			
		} else {
			req.setAttribute("msg", "Movie not found with Id:" + id);
		}

		RequestDispatcher rd = req.getRequestDispatcher("update_movie.jsp");
		rd.forward(req, resp);

	}

}
