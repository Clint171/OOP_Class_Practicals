package dev.clint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SignupFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNewUsername;
	private JPasswordField pwdConfirmPassword;
	private JPasswordField pwdNewPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupFrame frame = new SignupFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the this.
	 */
	public SignupFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.getContentPane().setBackground(Color.GREEN);
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel lblNewUsername = new JLabel("New Username:");
		lblNewUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewUsername.setBounds(15, 16, 123, 20);
		this.getContentPane().add(lblNewUsername);
		
		txtNewUsername = new JTextField();
		lblNewUsername.setLabelFor(txtNewUsername);
		txtNewUsername.setBounds(153, 13, 205, 26);
		this.getContentPane().add(txtNewUsername);
		txtNewUsername.setColumns(10);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewPassword.setBounds(15, 72, 123, 20);
		this.getContentPane().add(lblNewPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmPassword.setBounds(15, 130, 135, 20);
		this.getContentPane().add(lblConfirmPassword);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Signup logic
			}
		});
		btnCreateAccount.setBounds(153, 182, 205, 29);
		this.getContentPane().add(btnCreateAccount);
		
		pwdConfirmPassword = new JPasswordField();
		lblConfirmPassword.setLabelFor(pwdConfirmPassword);
		pwdConfirmPassword.setBounds(153, 127, 205, 26);
		this.getContentPane().add(pwdConfirmPassword);
		
		pwdNewPassword = new JPasswordField();
		lblNewPassword.setLabelFor(pwdNewPassword);
		pwdNewPassword.setBounds(153, 69, 205, 26);
		this.getContentPane().add(pwdNewPassword);
	}

}
