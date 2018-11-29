package dragonproject;



public class SimpleDragon extends D20{

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
		this.setName("DRAGON");
	}

	public int attack() {
		
		return roll;
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
		
		
		int health = 0;

		for(int i = 1; i<=7; i++) {
			health = health + roll;
		}
		this.setHealth(health);
	}

	public void setName(String name) {
		this.name = name;
	}













}
