
public class Dog extends Pet {
	private double weight;
	
	public Dog() {
		super();
	}

	public Dog(double weight) {
		super();
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog: " +super.toString() + ", Weight=" + weight;
	}
}
