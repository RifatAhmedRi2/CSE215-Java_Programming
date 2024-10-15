import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AddTickets extends JFrame {

	private JPanel contentPane;
	private JTextField ticketPrice;
	private JTextField totalTickets;
	private JTextField matchDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTickets frame = new AddTickets();
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
	public AddTickets() {
		this.ticketService = new TicketService();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox ttypeCombo = new JComboBox();
		ttypeCombo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ttypeCombo.setModel(new DefaultComboBoxModel(new String[] {"VIP-AC", "VIP-(Non-AC)", "Chair", "Stand"}));
		ttypeCombo.setBounds(372, 127, 239, 29);
		contentPane.add(ttypeCombo);
		
		JLabel ttype = new JLabel("Ticket Type");
		ttype.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ttype.setBounds(199, 124, 163, 35);
		contentPane.add(ttype);
		
		JLabel tprice = new JLabel("Ticket Price");
		tprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tprice.setBounds(199, 188, 163, 35);
		contentPane.add(tprice);
		
		JLabel totalt = new JLabel("Total Tickets");
		totalt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		totalt.setBounds(199, 257, 163, 35);
		contentPane.add(totalt);
		
		JLabel tdate = new JLabel("Match Date");
		tdate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tdate.setBounds(199, 323, 163, 35);
		contentPane.add(tdate);
		
		ticketPrice = new JTextField();
		ticketPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ticketPrice.setBounds(372, 193, 337, 29);
		contentPane.add(ticketPrice);
		ticketPrice.setColumns(10);
		
		totalTickets = new JTextField();
		totalTickets.setFont(new Font("Tahoma", Font.PLAIN, 13));
		totalTickets.setBounds(372, 262, 337, 29);
		contentPane.add(totalTickets);
		totalTickets.setColumns(10);
		
		matchDate = new JTextField();
		matchDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		matchDate.setBounds(372, 328, 337, 29);
		contentPane.add(matchDate);
		matchDate.setColumns(10);
		
		JButton addTicketButton = new JButton("Add Tickets");
		addTicketButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				String ttype = (String)ttypeCombo.getSelectedItem();
				String tPrice = ticketPrice.getText();
				String amountOfTickets = totalTickets.getText();
				String mDate = matchDate.getText();
				
				if(ttype.isEmpty()) {
		            JOptionPane.showMessageDialog(addTicketButton, "Please enter a Ticket Type");
		            return;
		        }
		       
		        if(tPrice.isEmpty() || !tPrice.chars().allMatch(Character::isDigit) ||
		                Integer.parseInt(tPrice) <= 0) {
		            JOptionPane.showMessageDialog(addTicketButton, "Please enter a Valid Price for the Ticket");
		            return;
		        }
		        
		        if(amountOfTickets.isEmpty() || !amountOfTickets.chars().allMatch(Character::isDigit) 
		                || Integer.parseInt(amountOfTickets) <=0) {
		            JOptionPane.showMessageDialog(addTicketButton, "Please enter the Total Amount of Tickets to be Sold");
		            return;
		        }
		        
		        if(mDate.isEmpty()) {
		            JOptionPane.showMessageDialog(addTicketButton, "Please Enter the Date of the Match");
		            return;
		        }
		        
		        Ticket ticket = new Ticket((String)ttypeCombo.getSelectedItem(), Integer.parseInt(ticketPrice.getText()), Integer.parseInt(totalTickets.getText()), matchDate.getText());
		        
		        ticketService.create(ticket);
		      
		        ttypeCombo.setSelectedItem(null);
		        ticketPrice.setText(null);
		        totalTickets.setText(null);
		        matchDate.setText(null);
		        JOptionPane.showMessageDialog(addTicketButton, "Tickets Added");
			}
		});		
		addTicketButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		addTicketButton.setBounds(204, 402, 231, 58);
		contentPane.add(addTicketButton);
		
		JButton backButton = new JButton("Back to Previous Page");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminAccess adminAccess = new AdminAccess();
				adminAccess.setVisible(true);
			}
		});
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		backButton.setBounds(751, 11, 239, 58);
		contentPane.add(backButton);
		
		JButton updateButton = new JButton("Update Info");
		updateButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ticket ticket = new Ticket((String)ttypeCombo.getSelectedItem(), Integer.parseInt(ticketPrice.getText()), Integer.parseInt(totalTickets.getText()), matchDate.getText());
		        
				ticketService.update((String)ttypeCombo.getSelectedItem(), ticket);
				
				ttypeCombo.setSelectedItem(null);
		        ticketPrice.setText(null);
		        totalTickets.setText(null);
		        matchDate.setText(null);
		        JOptionPane.showMessageDialog(addTicketButton, "Ticket Info Updated");
			}
		});
		updateButton.setBounds(527, 402, 239, 58);
		contentPane.add(updateButton);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Gray White Tilted2.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 1000, 527);
		contentPane.add(lblNewLabel);
	}
}
