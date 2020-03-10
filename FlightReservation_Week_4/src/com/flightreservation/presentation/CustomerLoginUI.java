package com.flightreservation.presentation;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.flightreservation.model.domain.Customer;

public class CustomerLoginUI extends JFrame {
	
	private static final long serialVersionUID = 1L;

	private JMenuBar jMenuBar;
	private JMenu jFileMenu;
	private JMenu jDataMenu;
	private JMenuItem jFileMenuItem;
	private JMenuItem jDatabaseMenuItem;
	private JPanel jPanel;
	
	private JLabel jLabelUsername;
	private JTextField jTextFieldUsername;
	private JLabel jLabelPassword;
	private JTextField jTextFieldPassword;
	
	
	private JButton jSubmitButton;
	private JButton jCancelButton;
	
	private CustomerLoginUIController customerLoginUIController;
	
	public CustomerLoginUI() {
		
		initElements();
		customerLoginUIController = new CustomerLoginUIController(this);
		this.setSize(450, 350);
		this.setVisible(true);
	}
	
	
	
	public JButton getSubmitButton() {
		return jSubmitButton;
	}

	public JButton getCancelButton() {
		return jCancelButton;
	}
	
	public void initElements() {
		jMenuBar = new JMenuBar();
		setJMenuBar(jMenuBar);
		jFileMenu = new JMenu();
		jDataMenu = new JMenu();
		jFileMenuItem = new JMenuItem();
		jDatabaseMenuItem = new JMenuItem();
		jPanel = new JPanel();
		jLabelUsername = new JLabel();
		jTextFieldUsername = new JTextField();
		jLabelPassword = new JLabel();
		jTextFieldPassword = new JTextField();
		

		jSubmitButton = new JButton();
		jCancelButton = new JButton();

		jMenuBar.setOpaque(true);

		jFileMenu.setText("Login Form");
		jFileMenu.setFont(new Font("Comic Sans MS", 1, 11));
		
		jMenuBar.add(jFileMenu);

		
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Flight Reservation System");
		setFont(new Font("Comic Sans MS", 0, 10));
		getContentPane().setLayout(null);

		jPanel.setBackground(new Color(255, 233, 180));
		jPanel.setFont(new Font("Comic Sans MS", 0, 11));
		jPanel.setLayout(null);

		jLabelUsername.setText("Username: ");
		jLabelUsername.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelUsername);
		jLabelUsername.setBounds(20, 15, 120, 20);

		jTextFieldUsername.setText("Enter Username");
		jTextFieldUsername.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldUsername);
		jTextFieldUsername.setBounds(145, 15, 150, 20);

		jLabelPassword.setText("Password: ");
		jLabelPassword.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelPassword);
		jLabelPassword.setBounds(20, 45, 120, 20);

		//jTextFieldPassword.setText("*************");
		jTextFieldPassword.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldPassword);
		jTextFieldPassword.setBounds(145, 45, 150, 20);
		jSubmitButton.setText("SUBMIT");
		jSubmitButton.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jSubmitButton);
		jSubmitButton.setBounds(40, 230, 100, 20);

		jCancelButton.setText("CANCEL");
		jCancelButton.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jCancelButton);
		jCancelButton.setBounds(180, 230, 100, 20);

		getContentPane().add(jPanel);
		jPanel.setBounds(0, 0, 450, 350);
	}

	
public String[] getLoginInfo() {
		
		String username = jTextFieldUsername.getText();
		String password = jTextFieldPassword.getText();
		String[] info = {username, password};
		
		
		return info;
	}
	
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {

		@Override
		public void run() {
			CustomerLoginUI login = new CustomerLoginUI();

		}

	});
}

}