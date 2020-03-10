package com.flightreservation.presentation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.flightreservation.model.domain.Customer;

public class CustomerRegisterUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenuBar jMenuBar;
	private JMenu jFileMenu;
	private JMenu jDataMenu;
	private JMenuItem jFileMenuItem;
	private JMenuItem jDatabaseMenuItem;
	private JPanel jPanel;
	private JLabel jLabelFirstName;
	private JTextField jTextFieldFirstName;
	private JLabel jLabelLastName;
	private JTextField jTextFieldLastName;
	private JLabel jLabelIdNo;
	private JTextField jTextFieldIdNo;
	private JLabel jLabelPassportNo;
	private JTextField jTextFieldPassportNo;
	private JLabel jLabelEmail;
	private JTextField jTextFieldEmail;
	private JLabel jLabelPassword;
	private JTextField jTextFieldPassword;
	private JLabel jLabelPhone;
	private JTextField jTextFieldPhone;

	private JButton jSubmitButton;
	private JButton jCancelButton;
	
	private CustomerRegisterUIController customerRegisterUIController;

	public CustomerRegisterUI() {
		initElements();
		customerRegisterUIController = new CustomerRegisterUIController(this);
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
		jLabelFirstName = new JLabel();
		jTextFieldFirstName = new JTextField();
		jLabelLastName = new JLabel();
		jTextFieldLastName = new JTextField();
		jLabelIdNo = new JLabel();
		jTextFieldIdNo = new JTextField();
		jLabelPassportNo = new JLabel();
		jTextFieldPassportNo = new JTextField();
		jLabelEmail = new JLabel();
		jTextFieldEmail = new JTextField();
		jLabelPassword = new JLabel();
		jTextFieldPassword = new JTextField();
		jLabelPhone = new JLabel();
		jTextFieldPhone = new JTextField();
		jSubmitButton = new JButton();
		jCancelButton = new JButton();

		jMenuBar.setOpaque(true);

		jFileMenu.setText("Register new customer");
		jFileMenu.setFont(new Font("Comic Sans MS", 1, 11));
//		
//		jFileMenu.setText("Store Truck In Database");
//		jFileMenu.setFont(new Font("Comic Sans MS", 1, 11));
//
//		jDataMenu.setFont(new Font("Comic Sans MS", 1, 11));
//		jDataMenu.setText("Data");
//
//		jFileMenuItem.setFont(new Font("Comic Sans MS", 1, 11));
//		jFileMenuItem.setText("Open from File....");
//		jDataMenu.add(jFileMenuItem);
//
//		jDatabaseMenuItem.setFont(new Font("Comic Sans MS", 1, 11));
//		jDatabaseMenuItem.setText("Open From Database....");
//		jDatabaseMenuItem.setActionCommand("Open From Database...");
//		jDataMenu.add(jDatabaseMenuItem);
//
//		jFileMenu.add(jDataMenu);
		jMenuBar.add(jFileMenu);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Flight Reservation System");
		setFont(new Font("Comic Sans MS", 0, 10));
		getContentPane().setLayout(null);

		jPanel.setBackground(new Color(255, 233, 180));
		jPanel.setFont(new Font("Comic Sans MS", 0, 11));
		jPanel.setLayout(null);

		jLabelFirstName.setText("First Name: ");
		jLabelFirstName.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelFirstName);
		jLabelFirstName.setBounds(20, 15, 120, 20);

		jTextFieldFirstName.setText("Enter First Name:");
		jTextFieldFirstName.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldFirstName);
		jTextFieldFirstName.setBounds(145, 15, 150, 20);

		jLabelLastName.setText("Last Name: ");
		jLabelLastName.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelLastName);
		jLabelLastName.setBounds(20, 45, 120, 20);

		jTextFieldLastName.setText("Enter Last Name:");
		jTextFieldLastName.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldLastName);
		jTextFieldLastName.setBounds(145, 45, 150, 20);

		jLabelIdNo.setText("ID Number: ");
		jLabelIdNo.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelIdNo);
		jLabelIdNo.setBounds(20, 75, 120, 20);

		jTextFieldIdNo.setText("Enter Only Integer Number:");
		jTextFieldIdNo.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldIdNo);
		jTextFieldIdNo.setBounds(145, 75, 150, 20);

		jLabelPassportNo.setText("Passport Number: ");
		jLabelPassportNo.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelPassportNo);
		jLabelPassportNo.setBounds(20, 105, 120, 20);

		jTextFieldPassportNo.setText("Enter Only Integer Number:");
		jTextFieldPassportNo.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldPassportNo);
		jTextFieldPassportNo.setBounds(145, 105, 150, 20);

		jLabelEmail.setText("Email : ");
		jLabelEmail.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelEmail);
		jLabelEmail.setBounds(20, 135, 135, 20);

		jTextFieldEmail.setText("Enter Email:");
		jTextFieldEmail.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldEmail);
		jTextFieldEmail.setBounds(145, 135, 150, 20);

		jLabelPassword.setText("Password : ");
		jLabelPassword.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelPassword);
		jLabelPassword.setBounds(20, 170, 120, 20);

		jTextFieldPassword.setText("Enter Password:");
		jTextFieldPassword.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldPassword);
		jTextFieldPassword.setBounds(145, 170, 150, 20);

		jLabelPhone.setText("Phone : ");
		jLabelPhone.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelPhone);
		jLabelPhone.setBounds(20, 200, 120, 20);

		jTextFieldPhone.setText("Enter Only Integer Number:");
		jTextFieldPhone.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldPhone);
		jTextFieldPhone.setBounds(145, 200, 150, 20);

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

	public Customer getRegisteredCustomer() {
		
		String firstName = jTextFieldFirstName.getText();
		String lastName = jTextFieldLastName.getText();
		int idNo = Integer.parseInt(jTextFieldIdNo.getText());
		int passportNo = Integer.parseInt(jTextFieldPassportNo.getText());
		String email = jTextFieldEmail.getText();
		String password = jTextFieldPassword.getText();
		Long phone = Long.parseLong(jTextFieldPhone.getText());
		
		Customer customer= new Customer(firstName, lastName, idNo, passportNo, email, password, phone);
		
		
		return customer;
	}

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				CustomerRegisterUI register = new CustomerRegisterUI();

			}

		});
	}

}
