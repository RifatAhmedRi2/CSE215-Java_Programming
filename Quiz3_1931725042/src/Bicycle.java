
public class Bicycle extends Vehicle implements Comparable<Bicycle> {
	private String color;
	private int IDnumber;
	private String model;
	
	
	public Bicycle(String color, int iDnumber, String model) {
		this.color = color;
		IDnumber = iDnumber;
		this.model = model;
	}

	@Override
	public boolean equals(Vehicle o) {
		if (o.getModel().equals(this.model))
			return true;
		return false;
	}
	
	@Override
	public int compareTo(Bicycle o) {
		return 0;
	}
	
	@Override
	public void wheels() {
		System.out.println("A bicycle has two wheels");
	}

	@Override
	public String toString() {
		return "Bicycle: Color=" + getColor() + ", IDnumber=" + getIDnumber() + ", Model=" + getModel();
	}
	
}