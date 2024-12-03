/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Operations {
	
	SQLManage manage;
	Fail fail;
	Success success;
	
	Operations() throws SQLException {
		manage = new SQLManage();
		fail = new Fail();
		success = new Success();
	}
	
	public void opView(String str, int id) throws SQLException {
		Commons commons = new Commons();
		JFrame frame = (JFrame)commons.Frame();
		Font txt = new Font("", Font.BOLD, 15);
		
		//-----------------AMOUNT/PIN------------------
		JLabel label = new JLabel("Enter the " + str);
		label.setBounds(50, 270, 250, 20);
		label.setFont(txt);
		JTextField amt = new JTextField();
		amt.setBounds(50, 300, 500, 35);
		amt.setFont(txt);
		frame.add(label);
		frame.add(amt);
		//----------------------------------------------
		
		//------------------SUBMIT------------------------
		JButton sbt = new JButton("SUBMIT");
		sbt.setBounds(200, 400, 200, 50);
		sbt.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(sbt);
		sbt.addActionListener(new ActionListenerImpl(str, amt, id, frame));
		//------------------------------------------------
		
		if (str.equals("Balance")){
			amt.setVisible(false);
			sbt.setVisible(false);
			label.setText("Your Balance is : ");
			JLabel bal;
			try {
				bal = new JLabel(manage.balCheck(id)+"");
				bal.setBounds(0, 325, 600, 20);
				bal.setHorizontalAlignment(JLabel.CENTER);
				bal.setFont(new Font("", Font.BOLD, 25));
				frame.add(bal);
			} catch (SQLException e1) {
			}
		}
		
		frame.setVisible(true);
	}
	
	public void withdrawal(int amount, int id) {
		try {
			int check = manage.withdraw(amount, id);
			if(check==1) {
				success.successView(id);
			}
			else {
				fail.failView("INSUFFICIENT BALANCE!!!");
			}
		}
		catch (SQLException e1) {
		}
	}

    private class ActionListenerImpl implements ActionListener {

        private final String str;
        private final JTextField amt;
        private final int id;
        private final JFrame frame;

        public ActionListenerImpl(String str, JTextField amt, int id, JFrame frame) {
            this.str = str;
            this.amt = amt;
            this.id = id;
            this.frame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (str) {
                case "Withdraw Amount" -> {
                    withdrawal(Integer.parseInt(amt.getText()), id);
                    frame.dispose();
                }
                case "Deposit Amount" -> {
                    try {
                        manage.deposit(Integer.parseInt(amt.getText()), id);
                        success.successView(id);
                        frame.dispose();
                    }
                    catch (SQLException e1) {
                    }
                }
                case "New PIN" -> {
                    try {
                        manage.pinchange(amt.getText(), id);
                        success.successView(id);
                        frame.dispose();
                    }
                    catch (SQLException e1) {
                    }
                }
                default -> {
                }
            }
        }
    }
}
