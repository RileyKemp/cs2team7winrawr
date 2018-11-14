
import java.util.Random;


public class SimpleDragon {

	private String name;
	private int health;

	/** constructors. */
	// default constructor
	public SimpleDragon() {
		NameTheDragon();
		setInitialHealth();
	}

	// constructor to accept name
	public SimpleDragon(String tempName) {
		this.setName(tempName);
		setInitialHealth();
	}


	/** custom methods */
	private void NameTheDragon() {
		this.setName("William");
	}

	public int attack() {
		Random random2 = new Random();
		return random2.nextInt(20)+1;
	}




	/** getters. */
	public int getHealth() {
		return this.health;
	}

	public String getName() {
		return name;
	}


	/** setters. */
	public void setDamage(int attack) {
		this.health = this.health - attack;
	}

	protected void setHealth(int health2) {
		this.health = health2;
	}

	public void setInitialHealth() {
		Random random1 = new Random();
		int health = 0;

		for(int i = 1; i<=7; i++) {
			health = health + random1.nextInt(20)+1;
		}
		this.setHealth(health);
	}

	public void setName(String name) {
		this.name = name;
	}













}
