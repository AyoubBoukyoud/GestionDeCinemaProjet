package model;

import java.sql.*;

public class UserModel {

    public static String authenticate(String username, String password) {
        String role = null;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema_management", "root", "1234");
            PreparedStatement pst = con.prepareStatement("SELECT role FROM utilisateurs WHERE username = ? AND password = ?");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                role = rs.getString("role");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return role; 
    }
}
