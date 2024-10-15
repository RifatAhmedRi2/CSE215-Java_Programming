
public class Ticket{
	private String ticketType;
	private int price;
	private int ticketAmount;
	private String matchDate;
	
	public Ticket() {
	}
	
	public Ticket(String ticketType, int price, int ticketAmount, String matchDate) {
		this.ticketType = ticketType;
		this.price = price;
		this.ticketAmount = ticketAmount;
		this.matchDate = matchDate;
	}
	
	public String getTicketType() {
		return ticketType;
	}
	
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getTicketAmount() {
		return ticketAmount;
	}
	
	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}
	
	public String getMatchDate() {
		return matchDate;
	}
	
	public void setMatchDate(String date) {
		this.matchDate = date;
	}
	
}
