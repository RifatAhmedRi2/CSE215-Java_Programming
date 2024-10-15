import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JSeparator;
import java.awt.Color;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel header = new JLabel("Login Menu");
		header.setForeground(Color.RED);
		header.setFont(new Font("Tahoma", Font.BOLD, 44));
		header.setBounds(381, 67, 285, 63);
		contentPane.add(header);
		
		JLabel lblNewLabel = new JLabel("New Here?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(334, 413, 89, 19);
		contentPane.add(lblNewLabel);
		
		JButton crtNewButton = new JButton("Create New Account");
		crtNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreateNewAccount createNewAccount = new CreateNewAccount();
				createNewAccount.setVisible(true);
			}
		});
		crtNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		crtNewButton.setBounds(433, 411, 220, 23);
		contentPane.add(crtNewButton);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String useridInput = usernameField.getText();
				@SuppressWarnings("deprecation")
				String passwordInput = passwordField.getText();
				
				try {
					Scanner fileScan = new Scanner (new File("NewAccount.txt"));
					while (fileScan.hasNextLine())
					{
						String s = fileScan.nextLine();
						String[] sArray = s.split(", ");
						if (useridInput.equals(sArray[0]) && passwordInput.equals(sArray[4])) {
							dispose();
							User user = new User();
							user.setVisible(true);
							break;
						}
						else if(fileScan.hasNextLine())
							continue;
						
						else {
							JOptionPane.showMessageDialog(null, "Invalid Username or Password. Please Try again!", "Error", JOptionPane.ERROR_MESSAGE);
							usernameField.setText(null);
							passwordField.setText(null);
							fileScan.close();	
						}
					}
				} catch (FileNotFoundException ex) {
					JOptionPane.showMessageDialog(null, "File Not Found", "Error", JOptionPane.ERROR_MESSAGE);
				}    
			}
		});
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		loginButton.setBounds(424, 328, 151, 44);
		contentPane.add(loginButton);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		usernameField.setBounds(400, 225, 260, 20);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(288, 226, 86, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(288, 275, 86, 17);
		contentPane.add(lblNewLabel_2);
		
		JButton mainMenuButton = new JButton("Main Menu");
		mainMenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainMenu mainMenu = new MainMenu();
				mainMenu.setVisible(true);
			}
		});
		mainMenuButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		mainMenuButton.setBounds(821, 11, 169, 63);
		contentPane.add(mainMenuButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordField.setBounds(400, 274, 260, 20);
		contentPane.add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(172, 164, 621, 2);
		contentPane.add(separator);
		
		JLabel background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		background.setIcon(new ImageIcon(img));
		background.setBounds(0, 0, 1000, 527);
		contentPane.add(background);
		
	}
}
