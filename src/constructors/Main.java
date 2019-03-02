package constructors;

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3, 2);
		Rectangle rectangle2 = new Rectangle(2, 2, 4, 5);
		System.out.println("Rectangle area: " + rectangle2.getArea());
	}
}
