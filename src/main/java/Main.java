
import DBConnection.DatabaseConnection;
import GUI.LoginPage;
import com.formdev.flatlaf.FlatLightLaf;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args){
        FlatLightLaf.setup();
       LoginPage login = new LoginPage();
       login.setVisible(true);
       DatabaseConnection db = new DatabaseConnection();
       db.connectDB();
    }
}
