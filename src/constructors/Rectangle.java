package constructors;

public class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(int x, int y) {
		// Con this() llamamos al constructor que recibe 4 parámetros
		this(x, y, 0, 0);
	}

	public Rectangle(int x, int y, int width, int height) {
		// Con super() llamamos al constructor de la clase padre. Podremos usar
		// this() o super() en los constructores pero nunca los dos en el mismo
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}
}
