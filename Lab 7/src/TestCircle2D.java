
public class TestCircle2D {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.println("Area is " + c1.getArea() +
				" and Perimeter is " + c1.getPerimeter());
		System.out.println("\nDoes circle1 contain the given point?");
		System.out.println(c1.contains(3,3));
		System.out.println("\nDoes circle1 contain the given circle?");
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("\nDoes circle1 overlap the given circle?");
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
