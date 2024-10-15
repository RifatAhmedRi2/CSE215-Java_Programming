import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton userButton = new JButton("Buy a Ticket");
		userButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserLogin userLogin = new UserLogin();
				userLogin.setVisible(true);
			}
		});
		userButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userButton.setBackground(new Color(0, 128, 0));
		userButton.setBounds(366, 254, 273, 65);
		contentPane.add(userButton);
		
		JButton adminButton = new JButton("Administrator");
		adminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin adminLogin = new AdminLogin();
				adminLogin.setVisible(true);
			}
		});
		adminButton.setBackground(new Color(135, 206, 250));
		adminButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		adminButton.setBounds(813, 11, 177, 58);
		contentPane.add(adminButton);
		
		JLabel title = new JLabel("Stadium Ticket Management");
		title.setForeground(Color.GREEN);
		title.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 66));
		title.setBounds(83, 362, 845, 65);
		contentPane.add(title);
		
		JLabel background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/home.jpg")).getImage();
		background.setIcon(new ImageIcon(img));
		background.setBounds(0, 0, 1000, 527);
		contentPane.add(background);
	}

}
