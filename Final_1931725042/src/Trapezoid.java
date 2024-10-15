
public class Trapezoid extends GeometricObject implements Cloneable {
	private double sideA;
	private double sideB;
	private double height;
	
	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Trapezoid(double sideA, double sideB, double height, String color, boolean filled) {
		super(color, filled);
		this.sideA = sideA;
		this.sideB = sideB;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (1/2) * (sideA + sideB) * height;
	}

	@Override
	public String toString() {
		return "Trapezoid [sideA=" + sideA + ", sideB=" + sideB + ", height=" + height + ", Area=" + getArea()
				+ ", Color=" + getColor() + ", Filled?=" + isFilled() + ", DateCreated()=" + getDateCreated()
				+ ", toString()=" + super.toString();
	}
}
