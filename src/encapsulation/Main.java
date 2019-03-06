package encapsulation;


public class Main {
	public static void main(String[] args) {
		EnhancedPlayer player = new EnhancedPlayer("tim", 200, "sword");
		System.out.println("initial health is " + player.getHealth());
	}
}
