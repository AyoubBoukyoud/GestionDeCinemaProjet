package model;

import View.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShowtimesModel {

    private static int getMovieId(String title) {
        int id = -1;
        try ( Connection conn = DBConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(
                  "SELECT movie_id FROM movies WHERE title = ?") )
        {
            ps.setString(1, title);
            try ( ResultSet rs = ps.executeQuery() ) {
                if (rs.next()) {
                    id = rs.getInt("movie_id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public static List<String> fetchMovies() {
        List<String> list = new ArrayList<>();
        try ( Connection conn = DBConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(
                  "SELECT title FROM movies");
              ResultSet rs = ps.executeQuery() )
        {
            while (rs.next()) {
                list.add(rs.getString("title"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> fetchDates(String film) {
        List<String> list = new ArrayList<>();
        int movieId = getMovieId(film);
        if (movieId < 0) return list;
        try ( Connection conn = DBConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(
                  "SELECT DISTINCT show_date FROM showtimes WHERE movie_id = ? ORDER BY show_date") )
        {
            ps.setInt(1, movieId);
            try ( ResultSet rs = ps.executeQuery() ) {
                while (rs.next()) {
                    list.add(rs.getString("show_date"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> fetchTimes(String film, String date) {
        List<String> list = new ArrayList<>();
        int movieId = getMovieId(film);
        if (movieId < 0) return list;
        try ( Connection conn = DBConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(
                  "SELECT DISTINCT show_time FROM showtimes WHERE movie_id = ? AND show_date = ?") )
        {
            ps.setInt(1, movieId);
            ps.setString(2, date);
            try ( ResultSet rs = ps.executeQuery() ) {
                while (rs.next()) {
                    list.add(rs.getString("show_time"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> fetchHalls(String film, String date, String time) {
        List<String> list = new ArrayList<>();
        int movieId = getMovieId(film);
        if (movieId < 0) return list;
        try ( Connection conn = DBConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(
                  "SELECT DISTINCT hall_number FROM showtimes "
                + "WHERE movie_id = ? AND show_date = ? AND show_time = ?") )
        {
            ps.setInt(1, movieId);
            ps.setString(2, date);
            ps.setString(3, time);
            try ( ResultSet rs = ps.executeQuery() ) {
                while (rs.next()) {
                    list.add(rs.getString("hall_number"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static boolean insertShowtime(String film,
                                     String date,
                                     String time,
                                     String hall,
                                     int availableSeats) {
    int movieId = getMovieId(film);
    if (movieId < 0) return false;
    String sql = """
        INSERT INTO showtimes
          (movie_id, show_date, show_time, hall_number, available_seats)
        VALUES (?,?,?,?,?)
        """;
    try ( Connection conn = DBConnection.getConnection();
          PreparedStatement ps = conn.prepareStatement(sql) ) {
        ps.setInt(1, movieId);
        ps.setString(2, date);
        ps.setString(3, time);
        ps.setString(4, hall);
        ps.setInt(5, availableSeats);      // NEW
        ps.executeUpdate();
        return true;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
}
