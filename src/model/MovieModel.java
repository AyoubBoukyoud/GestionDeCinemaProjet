// src/model/MovieModel.java
package model;

import View.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieModel {

    public static List<Movie> fetchAll() throws SQLException {
        List<Movie> list = new ArrayList<>();
        String sql = "SELECT * FROM movies";
        try ( Connection conn = DBConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(sql);
              ResultSet rs = ps.executeQuery() )
        {
            while (rs.next()) {
                list.add(new Movie(
                  rs.getInt("movie_id"),
                  rs.getString("title"),
                  rs.getString("genre"),
                  rs.getInt("duration"),
                  rs.getString("release_date"),
                  rs.getString("poster_path")
                ));
            }
        }
        return list;
    }

    public static void insert(String title, String genre, int duration,
                              String releaseDate, String posterPath) throws SQLException {
        String sql = "INSERT INTO movies "
                   + "(title, genre, duration, release_date, poster_path) "
                   + "VALUES (?,?,?,?,?)";
        try ( Connection conn = DBConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(sql) )
        {
            ps.setString(1, title);
            ps.setString(2, genre);
            ps.setInt(3, duration);
            ps.setString(4, releaseDate);
            ps.setString(5, posterPath);
            ps.executeUpdate();
        }
    }

    public static void update(int id, String title, String genre, int duration,
                              String releaseDate, String posterPath) throws SQLException {
        String sql = "UPDATE movies SET title=?,genre=?,duration=?,"
                   + "release_date=?,poster_path=? WHERE movie_id=?";
        try ( Connection conn = DBConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(sql) )
        {
            ps.setString(1, title);
            ps.setString(2, genre);
            ps.setInt(3, duration);
            ps.setString(4, releaseDate);
            ps.setString(5, posterPath);
            ps.setInt(6, id);
            ps.executeUpdate();
        }
    }

    public static void delete(int id) throws SQLException {
        String sql = "DELETE FROM movies WHERE movie_id=?";
        try ( Connection conn = DBConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(sql) )
        {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
