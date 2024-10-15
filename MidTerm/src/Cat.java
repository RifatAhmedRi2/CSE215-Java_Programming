
public class Cat extends Pet {
	private String coatColor;

	public Cat() {
		super();
	}

	public Cat(String coatColor) {
		super();
		this.coatColor = coatColor;
	}
	
	public String getCoatColor() {
		return coatColor;
	}

	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}

	@Override
	public String toString() {
		return "Cat: " +super.toString() + ", Coat Color=" + coatColor;
	}
}
