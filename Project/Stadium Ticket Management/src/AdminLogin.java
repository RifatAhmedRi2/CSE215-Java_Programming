import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.SystemColor;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = passwordField.getText();
				
				if (username.contains("admin") && password.contains("admin")) {
					dispose();
					AdminAccess adminAccess = new AdminAccess();
					adminAccess.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Username or Password. Please Try again!");
					usernameField.setText(null);
					passwordField.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(380, 336, 232, 64);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Back to Main Menu");
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainMenu mainMenu = new MainMenu();
				mainMenu.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(801, 11, 189, 57);
		contentPane.add(btnNewButton_2);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usernameField.setBounds(400, 198, 239, 20);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(266, 196, 124, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(266, 248, 124, 19);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordField.setBounds(400, 250, 239, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Administrator Login");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_2.setBounds(329, 71, 415, 64);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(174, 146, 621, 2);
		contentPane.add(separator);
		
		JLabel background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/admin.jpg")).getImage();
		background.setIcon(new ImageIcon(img));
		background.setBounds(0, 0, 1000, 527);
		contentPane.add(background);
		
	}
}
