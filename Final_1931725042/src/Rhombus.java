
public class Rhombus extends GeometricObject implements Cloneable {
	private double side;
	private double height;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rhombus(double side, double height, String color, boolean filled) {
		super(color, filled);
		this.side = side;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return side * height;
	}

	@Override
	public String toString() {
		return "Rhombus: Side=" + side + ", Height=" + height + ", Area=" + getArea() + ", Color=" + getColor() + ", Filled?="
				+ isFilled() + ", DateCreated()=" + getDateCreated() + ", toString()=" + super.toString();
	}
	
	
	
}
