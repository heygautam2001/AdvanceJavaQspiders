package controller;



import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MovieDao;
import model.entity.Movie;



@WebServlet("/viewAllMovies")
public class ViewAllMovieController extends HttpServlet {

    private MovieDao movieDao = new MovieDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Call DAO method
    	
        List<Movie> movieList =  movieDao.findAllMovie();

        // 2. Store result in request scope
        request.setAttribute("movies", movieList);

        // 3. Forward to JSP page for display
        request.getRequestDispatcher("viewAllMovie.jsp").forward(request, response);
    }
}
