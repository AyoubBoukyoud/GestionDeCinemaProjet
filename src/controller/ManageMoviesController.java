// src/controller/ManageMoviesController.java
package controller;

import model.Movie;
import model.MovieModel;

import java.sql.SQLException;
import java.util.List;

public class ManageMoviesController {

    /** Returns all movies to populate your JTable */
    public List<Movie> getAllMovies() throws SQLException {
        return MovieModel.fetchAll();
    }

    /** Inserts a new movie, returns true on success */
    public boolean addMovie(String title, String genre, int duration,
                            String releaseDate, String posterPath) {
        try {
            MovieModel.insert(title, genre, duration, releaseDate, posterPath);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /** Updates an existing movie */
    public boolean updateMovie(int id, String title, String genre,
                               int duration, String releaseDate,
                               String posterPath) {
        try {
            MovieModel.update(id, title, genre, duration, releaseDate, posterPath);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /** Deletes a movie by its ID */
    public boolean deleteMovie(int id) {
        try {
            MovieModel.delete(id);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
