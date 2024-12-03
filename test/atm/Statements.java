/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class Statements {
    public void stateView(int id) throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
        Commons commons = new Commons();
        JFrame frame = (JFrame)commons.Frame();
        SQLManage manage = new SQLManage();
        
        //------------------LABEL----------------------------
        JLabel label = new JLabel("MINI STATEMENTS");
        label.setBounds(0, 200, 575, 30);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Rockwell", Font.BOLD, 25));
        frame.add(label);
        //---------------------------------------------------
        
        //------------------TABLE----------------------------
        JTable table = new JTable() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        model = (DefaultTableModel)table.getModel();
        model.addColumn("ID");
        model.addColumn("DEPOSIT");
        model.addColumn("WITHDRAW");
        model.addColumn("BALANCE");
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);
        JScrollPane sc = new JScrollPane(table);
        sc.setBounds(50, 250, 500, 200);
        frame.add(sc);
        //-----------------------------------------------------------
        
        //------------------TABLE DATA-------------------------------
        ResultSet rst = manage.stm(id);
        int i = 0;
        while(rst.next()) {
            model.addRow(new Object[0]);
            model.setValueAt(rst.getInt("transid"), i, 0);
            if(rst.getString("stat").equals("dep")) {
                model.setValueAt(rst.getString("amount"), i, 1);
                model.setValueAt("-", i, 2);
            }
            else {
                model.setValueAt("-", i, 1);
                model.setValueAt(rst.getString("amount"), i, 2);
            }
            model.setValueAt(rst.getInt("bal"), i, 3);
            i++;
        }
        //-----------------------------------------------------------
        
        frame.setVisible(true);
    }
}


    

