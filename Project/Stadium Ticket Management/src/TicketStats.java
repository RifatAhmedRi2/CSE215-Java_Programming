import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TicketStats extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketStats frame = new TicketStats();
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
	public TicketStats() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton backButton = new JButton("Back");
		backButton.setBounds(846, 11, 144, 54);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				User user = new User();
				user.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(backButton);
		
		JLabel header = new JLabel("Ticket Info");
		header.setFont(new Font("Tahoma", Font.BOLD, 40));
		header.setBounds(385, 66, 227, 44);
		contentPane.add(header);
		
		JLabel ticketType = new JLabel("Ticket Type");
		ticketType.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ticketType.setBounds(183, 164, 108, 25);
		contentPane.add(ticketType);
		
		JLabel ticketPrice = new JLabel("Ticket Price");
		ticketPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ticketPrice.setBounds(354, 164, 108, 25);
		contentPane.add(ticketPrice);
		
		JLabel ticketsRemaining = new JLabel("Tickets Remaining");
		ticketsRemaining.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ticketsRemaining.setBounds(515, 164, 135, 25);
		contentPane.add(ticketsRemaining);
		
		JLabel lblNewLabel_4 = new JLabel("Match Date");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(699, 164, 108, 25);
		contentPane.add(lblNewLabel_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(158, 200, 649, 3);
		contentPane.add(separator);
		
		JSeparator vSeparator1 = new JSeparator();
		vSeparator1.setForeground(Color.BLACK);
		vSeparator1.setOrientation(SwingConstants.VERTICAL);
		vSeparator1.setBounds(301, 154, 2, 293);
		contentPane.add(vSeparator1);
		
		JSeparator vSeparator2 = new JSeparator();
		vSeparator2.setOrientation(SwingConstants.VERTICAL);
		vSeparator2.setForeground(Color.BLACK);
		vSeparator2.setBounds(487, 154, 2, 293);
		contentPane.add(vSeparator2);
		
		JSeparator vSeparator3 = new JSeparator();
		vSeparator3.setOrientation(SwingConstants.VERTICAL);
		vSeparator3.setForeground(Color.BLACK);
		vSeparator3.setBounds(665, 154, 2, 293);
		contentPane.add(vSeparator3);

		JLabel typeLabel1 = new JLabel("");
		typeLabel1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		typeLabel1.setBounds(183, 228, 90, 14);
		contentPane.add(typeLabel1);
		
		JLabel typeLabel2 = new JLabel("");
		typeLabel2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		typeLabel2.setBounds(183, 270, 90, 14);
		contentPane.add(typeLabel2);
		
		JLabel typeLabel3 = new JLabel("");
		typeLabel3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		typeLabel3.setBounds(183, 313, 90, 14);
		contentPane.add(typeLabel3);
		
		JLabel typeLabel4 = new JLabel("");
		typeLabel4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		typeLabel4.setBounds(183, 361, 90, 14);
		contentPane.add(typeLabel4);

		JLabel priceLabel1 = new JLabel("");
		priceLabel1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		priceLabel1.setBounds(368, 228, 90, 14);
		contentPane.add(priceLabel1);
		
		JLabel priceLabel2 = new JLabel("");
		priceLabel2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		priceLabel2.setBounds(368, 270, 90, 14);
		contentPane.add(priceLabel2);
		
		JLabel priceLabel3 = new JLabel("");
		priceLabel3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		priceLabel3.setBounds(368, 313, 90, 14);
		contentPane.add(priceLabel3);
		
		JLabel priceLabel4 = new JLabel("");
		priceLabel4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		priceLabel4.setBounds(368, 361, 90, 14);
		contentPane.add(priceLabel4);

		JLabel amountLabel1 = new JLabel("");
		amountLabel1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		amountLabel1.setBounds(560, 228, 90, 14);
		contentPane.add(amountLabel1);
		
		JLabel amountLabel2 = new JLabel("");
		amountLabel2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		amountLabel2.setBounds(560, 270, 90, 14);
		contentPane.add(amountLabel2);
		
		JLabel amountLabel3 = new JLabel("");
		amountLabel3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		amountLabel3.setBounds(560, 313, 90, 14);
		contentPane.add(amountLabel3);
		
		JLabel amountLabel4 = new JLabel("");
		amountLabel4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		amountLabel4.setBounds(560, 361, 90, 14);
		contentPane.add(amountLabel4);

		JLabel dateLabel1 = new JLabel("");
		dateLabel1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dateLabel1.setBounds(709, 229, 98, 14);
		contentPane.add(dateLabel1);
		
		JLabel dateLabel2 = new JLabel("");
		dateLabel2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dateLabel2.setBounds(709, 271, 94, 14);
		contentPane.add(dateLabel2);
		
		JLabel dateLabel3 = new JLabel("");
		dateLabel3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dateLabel3.setBounds(709, 314, 94, 14);
		contentPane.add(dateLabel3);
		
		JLabel dateLabel4 = new JLabel("");
		dateLabel4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dateLabel4.setBounds(709, 362, 94, 14);
		contentPane.add(dateLabel4);
		
		ArrayList<String> arrayList = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("Ticket.txt"))) {
		    while (reader.ready()) {
		        arrayList.add(reader.readLine());
		    }
		}
		catch (IOException e) {
		    System.out.println(e);
		}
		
		String line1 = arrayList.get(0);
		String[] parts1 = line1.split(", ");
		typeLabel1.setText(parts1[0]);
		priceLabel1.setText(parts1[1] + " BDT");
		amountLabel1.setText(parts1[2]);
		dateLabel1.setText(parts1[3]);
		
		String line2 = arrayList.get(1);
		String[] parts2 = line2.split(", ");
		typeLabel2.setText(parts2[0]);
		priceLabel2.setText(parts2[1] + " BDT");
		amountLabel2.setText(parts2[2]);
		dateLabel2.setText(parts2[3]);

		String line3 = arrayList.get(2);
		String[] parts3 = line3.split(", ");
		typeLabel3.setText(parts3[0]);
		priceLabel3.setText(parts3[1] + " BDT");
		amountLabel3.setText(parts3[2]);
		dateLabel3.setText(parts3[3]);
		
		String line4 = arrayList.get(3);
		String[] parts4 = line4.split(", ");
		typeLabel4.setText(parts4[0]);
		priceLabel4.setText(parts4[1] + " BDT");
		amountLabel4.setText(parts4[2]);
		dateLabel4.setText(parts4[3]);
		
		JLabel background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Grey White half.jpg")).getImage();
		background.setIcon(new ImageIcon(img));
		background.setBounds(0, 0, 1000, 527);
		contentPane.add(background);
		
	}
}
