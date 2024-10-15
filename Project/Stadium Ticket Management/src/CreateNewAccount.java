import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;

public class CreateNewAccount extends JFrame {

	private JPanel contentPane;
	private JTextField usertext;
	private JTextField phonetext;
	private JTextField emailtext;
	private JTextField passtext;
	private JTextField retypetext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewAccount frame = new CreateNewAccount();
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
	public CreateNewAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(238, 165, 120, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(238, 213, 120, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(238, 259, 120, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(238, 305, 120, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Retype Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(238, 351, 120, 19);
		contentPane.add(lblNewLabel_4);
		
		usertext = new JTextField();
		usertext.setFont(new Font("Tahoma", Font.PLAIN, 13));
		usertext.setBounds(416, 164, 303, 20);
		contentPane.add(usertext);
		usertext.setColumns(10);
		
		phonetext = new JTextField();
		phonetext.setFont(new Font("Tahoma", Font.PLAIN, 13));
		phonetext.setBounds(416, 212, 303, 20);
		contentPane.add(phonetext);
		phonetext.setColumns(10);
		
		emailtext = new JTextField();
		emailtext.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emailtext.setBounds(416, 258, 303, 20);
		contentPane.add(emailtext);
		emailtext.setColumns(10);
		
		passtext = new JTextField();
		passtext.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passtext.setBounds(416, 304, 303, 20);
		contentPane.add(passtext);
		passtext.setColumns(10);
		
		retypetext = new JTextField();
		retypetext.setFont(new Font("Tahoma", Font.PLAIN, 13));
		retypetext.setBounds(416, 350, 303, 20);
		contentPane.add(retypetext);
		retypetext.setColumns(10);
		
		AccountService accountService = new AccountService();
		JButton crtNewButton = new JButton("Create Account");
		crtNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		crtNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = usertext.getText();
		        String phone = phonetext.getText();
		        String email = emailtext.getText();
		        String password = passtext.getText();
		        String retypepass= retypetext.getText();
		        if(name.isEmpty()) {
		             JOptionPane.showMessageDialog(null, "Please Enter a Name", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
		       
		        if(phone.isEmpty() || !phone.chars().allMatch(Character::isDigit) || Long.parseLong(phone) <= 0) {
		             JOptionPane.showMessageDialog(null, "Please enter a Valid Phone Numner", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
		        if(email.isEmpty()) {
		             JOptionPane.showMessageDialog(null, "Please enter a Valid Email", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
		        
		        if(password.isEmpty()) {
		             JOptionPane.showMessageDialog(null, "Please enter a Password", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
		        if(retypepass.isEmpty() ) {
		            JOptionPane.showMessageDialog(null, "Please Re-type your Password", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		             }
		        if (password.equals(retypepass)){
		        	Account Account = new Account(name,phone,email,password,retypepass);
		        	
		        	accountService.create(Account);
		    	   
		        	usertext.setText(null);
		        	phonetext.setText(null);
		        	emailtext.setText(null);
		        	passtext.setText(null);
		        	retypetext.setText(null);  
		        	JOptionPane.showMessageDialog(crtNewButton, "Account Created Successfully! You can Login now");
		        	dispose();
		        	UserLogin userLogin = new UserLogin();
		        	userLogin.setVisible(true);
		        } else {
		        	JOptionPane.showMessageDialog(null, "Password doesn't Match", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		crtNewButton.setBounds(376, 410, 202, 45);
		contentPane.add(crtNewButton);
		
		JButton backButton = new JButton("Back to Login Menu");
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserLogin userLogin = new UserLogin();
				userLogin.setVisible(true);
			}
		});
		backButton.setBounds(805, 11, 185, 45);
		contentPane.add(backButton);
		
		JLabel header = new JLabel("Create New Account");
		header.setFont(new Font("Tahoma", Font.BOLD, 36));
		header.setBounds(315, 47, 377, 45);
		contentPane.add(header);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(150, 127, 670, 2);
		contentPane.add(separator);
		
		JLabel background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Gray White Tilted.jpg")).getImage();
		background.setIcon(new ImageIcon(img));
		background.setBounds(0, 0, 1000, 527);
		contentPane.add(background);
		
	}
}
