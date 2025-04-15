
package model;

import View.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TicketModel {

    public static List<String> fetchMovies() throws SQLException {
        List<String> movies = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT title FROM movies");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                movies.add(rs.getString("title"));
            }
        }
        return movies;
    }

    public static List<String> fetchShowtimes(String filmTitle) throws SQLException {
        List<String> list = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps1 = conn.prepareStatement(
                 "SELECT movie_id FROM movies WHERE title = ?");
        ) {
            ps1.setString(1, filmTitle);
            try (ResultSet rs1 = ps1.executeQuery()) {
                if (!rs1.next()) return list;
                int movieId = rs1.getInt("movie_id");
                try (PreparedStatement ps2 = conn.prepareStatement(
                     "SELECT showtime_id, show_date, show_time FROM showtimes WHERE movie_id = ?")) {
                    ps2.setInt(1, movieId);
                    try (ResultSet rs2 = ps2.executeQuery()) {
                        while (rs2.next()) {
                            list.add("Showtime ID: "
                                + rs2.getInt("showtime_id")
                                + " - "
                                + rs2.getString("show_date")
                                + " "
                                + rs2.getString("show_time"));
                        }
                    }
                }
            }
        }
        return list;
    }

    public static void insertTicket(int showtimeId,
                                    String customer,
                                    String seat,
                                    String type,
                                    double price) throws SQLException {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                 "INSERT INTO tickets "
               + "(showtime_id, customer_name, seat, seat_type, price) "
               + "VALUES (?, ?, ?, ?, ?)")) {
            ps.setInt(1, showtimeId);
            ps.setString(2, customer);
            ps.setString(3, seat);
            ps.setString(4, type);
            ps.setDouble(5, price);
            ps.executeUpdate();
        }
    }
}
