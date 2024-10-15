
public class Octagon {
	private double side;
	public static void numberOfOctagon(int x) {
		x=7;
	}
	
	public Octagon() {
	}

	public Octagon(double side) {
		this.side = side;
	}
	
    public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea(){
		return (2+4/Math.sqrt(2))*side*side;
	}
	
	public double getPerimeter() {
		return 8*side;
	}
}
