package inheritance;

public class Dog extends Animal {
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail,
			int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}


	/*
	 * *Mirar src/constructors/Rectangle.java para comparar con overloading

	 * @Override sólo se puede hacer en instance methods, no en métodos static
	 * y tampoco podrá hacerse sobre métodos privados ni constructores
	 * Los métodos que sobreescriben deben llamarse igual, devolver el mismo tipo
	 * o una covariante, y recibir el mismo número de parámetros. También debe lanzar las mismas
	 * excepciones
	 * Una covariante podría ser cuando en el método padre se devuelve una burger
	 * y en el método que estamos haciendo overriding se devuelve una healthyBurger
	 * que es un hijo de Burger
	 * En tiempo de compilación nos avisará de errores si no estamos siguiendo las
	 * normas de @Override
	*/
	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		// super hace referencia a la clase padre, se usa para llamar al método del
		// padre en métodos @Override
		super.eat();
	}
}
