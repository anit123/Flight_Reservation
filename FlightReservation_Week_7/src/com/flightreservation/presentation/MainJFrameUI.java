package com.flightreservation.presentation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

public class MainJFrameUI extends JFrame{

	
	private static final long serialVersionUID = 1L;
	
	private JMenuBar jMenuBar;
	private JMenu jFileMenu;
	private JMenu jDataMenu;

	private JMenuItem jExitMenu;
	private JMenuItem jCustomerLoginMenu;
	private JMenuItem jCustomerRegisterMenu;
	private JMenuItem jFlightReservationMenu;
	
	private JPanel jPanel;
	private JLabel jLabel;
	
	public MainJFrameUI() {
		InitElements();
		MainJFrameUIController mainJFrameUIController = new MainJFrameUIController(this);
		this.setSize(650, 450);
		this.setVisible(true);
		
	}
	
	public JMenuItem getjExitMenu() {
		return jExitMenu;
	}


	public JMenuItem getjCustomerLoginMenu() {
		return jCustomerLoginMenu;
	}


	public JMenuItem getjCustomerRegisterMenu() {
		return jCustomerRegisterMenu;
	}

	public JMenuItem getjFlightReservationMenu() {
		return jFlightReservationMenu;
	}

	private void InitElements() {
		
		jMenuBar = new JMenuBar();
		setJMenuBar(jMenuBar);
		jFileMenu  = new JMenu();
		jDataMenu = new JMenu();
		jExitMenu = new JMenuItem();
		jCustomerLoginMenu = new JMenuItem();
		jCustomerRegisterMenu = new JMenuItem();
		jFlightReservationMenu = new JMenuItem();
		
		
		
		jMenuBar.setNextFocusableComponent(jFileMenu);
		jMenuBar.setOpaque(true);
		
		jFileMenu.setText("FILE");
		jFileMenu.setFont(new  Font("Courier", Font.BOLD, 12));
		
		jCustomerLoginMenu.setText("Customer Login");
		jCustomerLoginMenu.setFont(new Font("Comic Sans MS", 1, 10));
		jFileMenu.add(jCustomerLoginMenu);
		
		jCustomerRegisterMenu.setText("Customer Register");
		jCustomerRegisterMenu.setFont(new Font("Comic Sans MS", 1, 10));
		jFileMenu.add(jCustomerRegisterMenu);
		
		jFlightReservationMenu.setText("Flight Reservation");
		jFlightReservationMenu.setFont(new Font("Comic Sans MS", 1, 10));
		jFileMenu.add(jFlightReservationMenu);
		
		jExitMenu.setText("EXIT");
		jExitMenu.setFont(new Font("Comic Sans MS", 1, 10));
		jFileMenu.add(jExitMenu);
		
		jPanel = new JPanel();
		jLabel = new JLabel();
		
		jLabel.setText("WELCOME TO FLIGHT RESERVATION SYSTEM");
		jLabel.setFont(new  Font("Courier", Font.BOLD, 22));
		jPanel.add(jLabel);
		
		jPanel.setBorder(new LineBorder(Color.BLACK));
		jPanel.setLayout(new GridBagLayout());
		
		jMenuBar.add(jFileMenu);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Flight Reservation Application");
		
		setFont(new Font("Comic Sans MS", 1, 9));
		getContentPane().add(jPanel);
		
		pack();
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MainJFrameUI mainJFrame = new MainJFrameUI();
				
			}
		});
	}

}
