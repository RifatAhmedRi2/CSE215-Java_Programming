
public abstract class Vehicle {
	private String color;
	private int IDnumber;
	private String model;
	
	public Vehicle() {
	}
	
	public Vehicle(String color, int iDnumber, String model) {
		this.color = color;
		this.IDnumber = iDnumber;
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getIDnumber() {
		return IDnumber;
	}
	
	public void setIDnumber(int iDnumber) {
		IDnumber = iDnumber;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public abstract void wheels();

	public boolean equals(Vehicle o) {
		return false;
	}
}
