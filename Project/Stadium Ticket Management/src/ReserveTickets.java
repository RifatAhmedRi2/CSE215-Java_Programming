import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReserveTickets extends JFrame {

	private JPanel contentPane;
	private JTextField reserveField;
	private final TicketService ticketService;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReserveTickets frame = new ReserveTickets();
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
	public ReserveTickets() {
		this.ticketService = new TicketService();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminAccess adminAccess = new AdminAccess();
				adminAccess.setVisible(true);
			}
		});
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		backButton.setBounds(846, 11, 144, 54);
		contentPane.add(backButton);
		
		JComboBox ttypeCombo = new JComboBox();
		ttypeCombo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ttypeCombo.setModel(new DefaultComboBoxModel(new String[] {"VIP-AC", "VIP-(Non-AC)", "Chair", "Stand"}));
		ttypeCombo.setBounds(350, 213, 327, 27);
		contentPane.add(ttypeCombo);
		
		reserveField = new JTextField();
		reserveField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		reserveField.setBounds(350, 276, 327, 27);
		contentPane.add(reserveField);
		reserveField.setColumns(10);
		
		JButton proceedButton = new JButton("Proceed");
		proceedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ttype = (String)ttypeCombo.getSelectedItem();
				String amountOfTickets = reserveField.getText();
				
				if(ttype.isEmpty()) {
		            JOptionPane.showMessageDialog(proceedButton, "Please enter a Ticket Type");
		            return;
		        }
		        
		        if(amountOfTickets.isEmpty() || !amountOfTickets.chars().allMatch(Character::isDigit) 
		                || Integer.parseInt(amountOfTickets) <=0) {
		            JOptionPane.showMessageDialog(proceedButton, "Please enter the Amount of Tickets to Reserve");
		            return;
		        }
		        
		        ticketService.reduceTicketAmountByTicketType((String)ttypeCombo.getSelectedItem(), Integer.parseInt(reserveField.getText()));
				
		        ttypeCombo.setSelectedItem(null);
				reserveField.setText(null);
		        JOptionPane.showMessageDialog(proceedButton, "Tickets Reserved");
			}
		});
		proceedButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		proceedButton.setBounds(404, 358, 185, 53);
		contentPane.add(proceedButton);
		
		JLabel ticketType = new JLabel("Ticket Type");
		ticketType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ticketType.setBounds(170, 211, 155, 31);
		contentPane.add(ticketType);
		
		JLabel reserveAmount = new JLabel("Reserve Amount");
		reserveAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		reserveAmount.setBounds(170, 274, 155, 31);
		contentPane.add(reserveAmount);
		
		JLabel header = new JLabel("Reserve Tickets");
		header.setFont(new Font("Tahoma", Font.BOLD, 36));
		header.setBounds(365, 82, 306, 54);
		contentPane.add(header);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(164, 165, 621, 2);
		contentPane.add(separator);
		
	}
}
