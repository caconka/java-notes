package encapsulation;

public class EnhancedPlayer {
	private String name;
	private int hitPoints = 100;
	private String weapon;

	public EnhancedPlayer(String name, int health, String weapon) {
		this.name = name;

		/*
		 * al tener los hitPoints encapsulados, no se pueden acceder desde fuera
		 * de la clase, por lo que nos aseguramos de que no se ponga un valor
		 * que no queremos
		 */
		if(health >0 && health <= 100) {
			this.hitPoints = health;
		}

		this.weapon = weapon;
	}

	public void loseHealth(int damage) {
		this.hitPoints = this.hitPoints - damage;
		if(this.hitPoints <=0) {
			System.out.println("Player knocked out");
		}
	}

	public int getHealth() {
		return hitPoints;
	}
}
