package com.arpit.networkChat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtIpaddress;
	private JTextField txtPort;
	private JLabel lblIpAddress;
	private JLabel lblPort;
	private JLabel lblEg;
	private JLabel lblEg_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(73, 72, 188, 22);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtIpaddress = new JTextField();
		txtIpaddress.setColumns(10);
		txtIpaddress.setBounds(73, 141, 188, 22);
		contentPane.add(txtIpaddress);
		
		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(73, 223, 188, 22);
		contentPane.add(txtPort);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(147, 52, 41, 16);
		contentPane.add(lblName);
		
		lblIpAddress = new JLabel("IP Address:");
		lblIpAddress.setBounds(131, 122, 72, 16);
		contentPane.add(lblIpAddress);
		
		lblPort = new JLabel("Port:");
		lblPort.setBounds(150, 202, 34, 16);
		contentPane.add(lblPort);
		
		lblEg = new JLabel("eg. 192.234.0.3");
		lblEg.setBounds(119, 164, 96, 16);
		contentPane.add(lblEg);
		
		lblEg_1 = new JLabel("eg. 4454");
		lblEg_1.setBounds(137, 246, 60, 16);
		contentPane.add(lblEg_1);
		
		JButton btnlogin = new JButton("login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String address = txtIpaddress.getText();
				int port = Integer.parseInt(txtPort.getText());
				login(name,address,port);
				
				
			}
		});
		btnlogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnlogin.setBounds(105, 304, 125, 36);
		contentPane.add(btnlogin);
	}
	
	private void login(String name, String address, int port) {
		dispose();
		System.out.println(name+" "+address+" "+port);
		
		
	}
}
