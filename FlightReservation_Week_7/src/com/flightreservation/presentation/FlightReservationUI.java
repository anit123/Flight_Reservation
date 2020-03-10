package com.flightreservation.presentation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.flightreservation.model.domain.FlightInformation;

public class FlightReservationUI extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private JMenuBar jMenuBar;
	private JMenu jFileMenu;
	private JMenu jDataMenu;
	private JMenuItem jFileMenuItem;
	private JMenuItem jDatabaseMenuItem;
	private JPanel jPanel;
	private JLabel jLabelFlightId;
	private JTextField jTextFieldFlightId;
	private JLabel jLabelFlightName;
	private JTextField jTextFieldFlightName;
	private JLabel jLabelFlightFrom;
	private JTextField jTextFieldFlightFrom;
	private JLabel jLabelFlightTo;
	private JTextField jTextFieldFlightTo;
	private JLabel jLabelFlightDate;
	private JTextField jTextFieldFlightDate;


	private JButton jSubmitButton;
	private JButton jCancelButton;
	
	private FlightReservationUIController flightReservationUIController;

	public FlightReservationUI() {
		initElements();
		flightReservationUIController = new FlightReservationUIController(this);
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
		jLabelFlightId = new JLabel();
		jTextFieldFlightId = new JTextField();
		jLabelFlightName = new JLabel();
		jTextFieldFlightName = new JTextField();
		jLabelFlightFrom = new JLabel();
		jTextFieldFlightFrom = new JTextField();
		jLabelFlightTo = new JLabel();
		jTextFieldFlightTo = new JTextField();
		jLabelFlightDate = new JLabel();
		jTextFieldFlightDate = new JTextField();

		jSubmitButton = new JButton();
		jCancelButton = new JButton();

		jMenuBar.setOpaque(true);


		jFileMenu.setText("Make new flight Reservation");
		jFileMenu.setFont(new Font("Comic Sans MS", 1, 11));
		
		jMenuBar.add(jFileMenu);
		
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Flight Reservation System");
		setFont(new Font("Comic Sans MS", 0, 10));
		getContentPane().setLayout(null);

		jPanel.setBackground(new Color(255, 233, 180));
		jPanel.setFont(new Font("Comic Sans MS", 0, 11));
		jPanel.setLayout(null);

		jLabelFlightId.setText("Flight ID: ");
		jLabelFlightId.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelFlightId);
		jLabelFlightId.setBounds(20, 15, 120, 20);

		jTextFieldFlightId.setText("Enter Flight ID:");
		jTextFieldFlightId.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldFlightId);
		jTextFieldFlightId.setBounds(145, 15, 150, 20);

		jLabelFlightName.setText("Flight Name: ");
		jLabelFlightName.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelFlightName);
		jLabelFlightName.setBounds(20, 45, 120, 20);

		jTextFieldFlightName.setText("Enter Flight Name:");
		jTextFieldFlightName.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldFlightName);
		jTextFieldFlightName.setBounds(145, 45, 150, 20);

		jLabelFlightFrom.setText("Flight From: ");
		jLabelFlightFrom.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelFlightFrom);
		jLabelFlightFrom.setBounds(20, 75, 120, 20);

		jTextFieldFlightFrom.setText("Enter Departure City");
		jTextFieldFlightFrom.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldFlightFrom);
		jTextFieldFlightFrom.setBounds(145, 75, 150, 20);

		jLabelFlightTo.setText("Flight to: ");
		jLabelFlightTo.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelFlightTo);
		jLabelFlightTo.setBounds(20, 105, 120, 20);

		jTextFieldFlightTo.setText("Enter Arrival City:");
		jTextFieldFlightTo.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldFlightTo);
		jTextFieldFlightTo.setBounds(145, 105, 150, 20);

		jLabelFlightDate.setText("Flight Date : ");
		jLabelFlightDate.setFont(new Font("Comic Sans MS", 1, 11));
		jPanel.add(jLabelFlightDate);
		jLabelFlightDate.setBounds(20, 135, 135, 20);

		jTextFieldFlightDate.setText("Enter Flight Date:");
		jTextFieldFlightDate.setFont(new Font("Comic Sans MS", 1, 10));
		jPanel.add(jTextFieldFlightDate);
		jTextFieldFlightDate.setBounds(145, 135, 150, 20);


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

	public FlightInformation getFlightInfo() {
		
		String flightId = jTextFieldFlightId.getText();
		String flightName = jTextFieldFlightName.getText();
		String flightFrom = jTextFieldFlightFrom.getText();
		String flightTo =jTextFieldFlightTo.getText();
		String flightDate = jTextFieldFlightDate.getText();

		
		FlightInformation flightInfo = new FlightInformation(flightId, flightName, flightFrom, flightTo, flightDate);
		
		
		return flightInfo;
	}

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				FlightReservationUI register = new FlightReservationUI();

			}

		});
	}
	

}
