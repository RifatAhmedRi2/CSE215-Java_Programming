
public class Car extends Vehicle implements Comparable<Car> {
	private String color;
	private int IDnumber;
	private String model;
	
	
	public Car(String color, int iDnumber, String model) {
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
	public void wheels() {
		System.out.println("A car has four wheels");
	}

	@Override
	public int compareTo(Car o) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Car: Color=" + getColor() + ", IDnumber=" + getIDnumber() + ", Model=" + getModel();
	}

	
}
