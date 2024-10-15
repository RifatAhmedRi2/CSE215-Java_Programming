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
import javax.swing.JLabel;

public class AdminAccess extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAccess frame = new AdminAccess();
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
	public AdminAccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1017, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton logOutButton = new JButton("Log Out");
		logOutButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin adminLogin = new AdminLogin();
				adminLogin.setVisible(true);
			}
		});
		logOutButton.setBounds(847, 11, 144, 54);
		contentPane.add(logOutButton);
		
		JButton reserveButton = new JButton("Reserve Tickets");
		reserveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ReserveTickets reserveTickets = new ReserveTickets();
				reserveTickets.setVisible(true);
			}
		});
		reserveButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		reserveButton.setBounds(525, 231, 213, 62);
		contentPane.add(reserveButton);
		
		JButton ticketButton = new JButton("Add/Update Tickets Info");
		ticketButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ticketButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddTickets addTickets = new AddTickets();
				addTickets.setVisible(true);
			}
		});
		ticketButton.setBounds(266, 231, 213, 62);
		contentPane.add(ticketButton);
		
		JButton btnNewButton = new JButton("View Current Info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminTicketStats adminTicketStats = new AdminTicketStats();
				adminTicketStats.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(399, 330, 201, 62);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(188, 178, 621, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Administrator Panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(317, 92, 404, 62);
		contentPane.add(lblNewLabel);
		
	}
}
