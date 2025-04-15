package controller;

import View.AdminDashbord;
import View.CaissierForm;
import model.UserModel;
import View.LoginView;

import javax.swing.*;

public class LoginController {
    private LoginView view;

public LoginController(LoginView view){
    this.view = view;
}

    public void login(String username , String password) {

        String role = UserModel.authenticate(username, password);

        if (role != null) {
            JOptionPane.showMessageDialog(view, "Login successfully!");

            if (role.equalsIgnoreCase("admin")) {
                new AdminDashbord().setVisible(true);
            } else if (role.equalsIgnoreCase("Caissier")) {
                new CaissierForm().setVisible(true);
            }

            view.dispose();
        } else {
            JOptionPane.showMessageDialog(view, "Login failed!");
        }
    }
}
