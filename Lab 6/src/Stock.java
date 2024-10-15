
public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / 
				previousClosingPrice) * 100;
	}
}
