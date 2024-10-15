import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class User extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buyButton = new JButton("Buy A Ticket");
		buyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				BuyTickets buyTickets = new BuyTickets();
				buyTickets.setVisible(true);
			}
		});
		buyButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buyButton.setBounds(250, 269, 203, 66);
		contentPane.add(buyButton);
		
		JButton viewButton = new JButton("View Tickets Availibility");
		viewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TicketStats ticketStats = new TicketStats();
				ticketStats.setVisible(true);
			}
		});
		viewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		viewButton.setBounds(547, 269, 203, 66);
		contentPane.add(viewButton);
		
		JButton logoutButton = new JButton("Log Out");
		logoutButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserLogin userLogin = new UserLogin();
				userLogin.setVisible(true);
			}
		});
		logoutButton.setBounds(845, 11, 145, 56);
		contentPane.add(logoutButton);
		
		JLabel header = new JLabel("User Menu");
		header.setFont(new Font("Tahoma", Font.BOLD, 40));
		header.setBounds(419, 100, 237, 60);
		contentPane.add(header);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(215, 202, 569, 2);
		contentPane.add(separator);
		
		JLabel logo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		logo.setIcon(new ImageIcon(img));
		logo.setBounds(335, 100, 60, 60);
		contentPane.add(logo);
		
	}
}
