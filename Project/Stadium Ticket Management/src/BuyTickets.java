import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class BuyTickets extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyTickets frame = new BuyTickets();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private final TicketService ticketService;
	
	/**
	 * Create the frame.
	 */
	public BuyTickets() {
		this.ticketService = new TicketService();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Amount of Ticket");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(290, 240, 132, 27);
		contentPane.add(lblNewLabel_1);
		
		JComboBox ttypeCombo = new JComboBox();
		ttypeCombo.setModel(new DefaultComboBoxModel(new String[] {"VIP-AC", "VIP-(Non-AC)", "Chair", "Stand"}));
		ttypeCombo.setBounds(494, 195, 187, 27);
		contentPane.add(ttypeCombo);
		
		JLabel lblNewLabel_2 = new JLabel("Ticket Type");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(290, 193, 132, 27);
		contentPane.add(lblNewLabel_2);
		
		JComboBox amountCombo = new JComboBox();
		amountCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		amountCombo.setBounds(494, 242, 187, 26);
		contentPane.add(amountCombo);
		
		JTextField showPrice = new JTextField("Show Price");
		showPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		showPrice.setBounds(494, 315, 187, 21);
		showPrice.setEditable(false);
		contentPane.add(showPrice);
		
		JButton backButton = new JButton("Back to Previous Page");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				User user = new User();
				user.setVisible(true);
			}
		});
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		backButton.setBounds(747, 11, 243, 69);
		contentPane.add(backButton);
		
		JButton checkoutbtn = new JButton("Checkout");
		checkoutbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ttype = (String)ttypeCombo.getSelectedItem();
				int amountOfTickets = Integer.parseInt((String)amountCombo.getSelectedItem());
		        
		        ticketService.reduceTicketAmountByTicketType((String)ttypeCombo.getSelectedItem(), Integer.parseInt((String)amountCombo.getSelectedItem()));
		        //ticketService.addTicketAmountByTicketType((String)ttypeCombo.getSelectedItem(), Integer.parseInt((String)amountCombo.getSelectedItem()));
		        
		        ttypeCombo.setSelectedItem(null);
		        amountCombo.setSelectedItem(null);
		        
		        JOptionPane.showMessageDialog(checkoutbtn, "Tickets Bought Successfully");
			}
		});
		checkoutbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkoutbtn.setBounds(428, 372, 150, 56);
		contentPane.add(checkoutbtn);
		
		JButton priceButton = new JButton("Net Payable Amount");
		priceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String totalPrice = ticketService.showAmount((String)ttypeCombo.getSelectedItem(), Integer.parseInt((String)amountCombo.getSelectedItem()));
		        showPrice.setText(totalPrice + " BDT");
			}
		});
		priceButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		priceButton.setBounds(290, 311, 168, 27);
		contentPane.add(priceButton);
		
		JLabel header = new JLabel("Purchase Menu");
		header.setFont(new Font("Tahoma", Font.BOLD, 36));
		header.setBounds(382, 64, 299, 69);
		contentPane.add(header);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(210, 144, 601, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/buytickets.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(449, 27, 541, 457);
		contentPane.add(lblNewLabel);
		
	}
}
