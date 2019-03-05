package composition;

public class Main {
	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("2208", "Dell", "240", dimensions);

		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		// Para acceder a un método de un objeto compuesto por otro se hace así
		thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
		thePC.getMotherboard().loadProgram("Windows 1.0");
		thePC.getTheCase().pressPowerButton();
		// Pero la mejor forma es utilizar métodos que usen dentro los objetos de
		// que se compone. powerUp() llama a theCase y monitor internamente
		thePC.powerUp();
	}
}
