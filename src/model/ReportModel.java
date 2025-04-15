package model;

import View.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReportModel {

    /** Fetches each film’s total revenue */
    public static List<Report> fetchReports() {
        List<Report> list = new ArrayList<>();
        String sql =
            "SELECT m.title, SUM(t.price) AS revenue " +
            "FROM movies m " +
            "JOIN showtimes s ON m.movie_id = s.movie_id " +
            "JOIN tickets t   ON s.showtime_id = t.showtime_id " +
            "GROUP BY m.title";

        try {
              Connection conn = DBConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(sql);
              ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String title   = rs.getString("title");
                double revenue = rs.getDouble("revenue");
                list.add(new Report(title, revenue));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
