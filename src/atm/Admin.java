/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class Admin {
    public void adminView(){
        Commons commons = new Commons();
        JFrame frame = (JFrame) commons.Frame();
        
        //-------------ADDUSERS------------------
        JButton add = new JButton("ADD USERS");
        add.setBounds(150, 250, 300, 100);
        add.setFont(new Font("Rockwell", Font.BOLD, 25));
        frame.add(add);
        add.addActionListener((ActionEvent e) -> {
            AddUser user = new AddUser();
            try {
                user.addView();
            } catch (SQLException e1) {
            }
            frame.dispose();
        });
        //---------------------------------------------
        
        //-----------------EXIT------------------------
        JButton exit = new JButton("EXIT");
        exit.setBounds(150, 400, 300, 100);
        exit.setFont(new Font("Rockwell", Font.BOLD, 25));
        frame.add(exit);
        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
		//---------------------------------------------
		frame.setVisible(true);
    }
}
    


    

