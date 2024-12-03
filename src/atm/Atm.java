/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

/**
 *
 * @author dell
 */
import java.sql.SQLException;

//MAIN MODULE

public class Atm {
    public static void main(String[] args) throws InterruptedException, SQLException {
        Login login = new Login();
        login.LoginView();
    }
}



