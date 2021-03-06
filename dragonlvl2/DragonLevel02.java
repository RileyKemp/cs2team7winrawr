

import java.util.Random;

public class DragonLevel02 extends SimpleDragon {
	private int attackBonusPoints;
	private int defenseBonusPoints;
	private int basePoints = 150;

	// default constructor, used by computer
	public DragonLevel02() {

		// initial Parameters
		initialParameters();

	}

	private void initialParameters() {
		setInitialAttackBonus();

		setInitialDefenseBonus();

		setInitialHealth();

	}


	/** Overrides from the SimpleDragon Class. */
	@Override
	public void setInitialHealth() {
		int health =
				this.basePoints -
				(this.attackBonusPoints +
						this.defenseBonusPoints);
		this.setHealth(health);

	}

	@Override
	public int attack() {
		int baseAttack;
		int totalAttack;
		Random random2 = new Random();
		baseAttack = random2.nextInt(20)+1;
		//System.out.print("Base attack was: " + baseAttack);
		totalAttack = baseAttack + this.getAttackBonusPoints();
		//System.out.println(". Total attack was: " + totalAttack + ".");
		return totalAttack;
	}

	// override setter
	@Override
	public void setDamage(int attack) {
		int totalDamage;
		totalDamage = attack / this.getDefenseBonusPoints();
		if (totalDamage < 1) {
			totalDamage = 1;
		}
		this.setHealth(this.getHealth() - totalDamage);
	}

	/** new for level 2 dragons. */

	protected void setInitialAttackBonus() {
		// attack bonus
		int attackBonus;
		Random random1 = new Random();
		attackBonus = random1.nextInt(this.basePoints)+1;
		this.setAttackBonusPoints(attackBonus);
	}

	private void setInitialDefenseBonus() {
		// defense bonus points
		int defenseBonus;
		Random random1 = new Random();
		defenseBonus = random1.nextInt(this.basePoints-this.getAttackBonusPoints())+1;
		this.setDefenseBonusPoints(defenseBonus);
	}


	/** Getters and Setters. */
	public int getBasePoints() {
		return this.basePoints;
	}

	public int getAttackBonusPoints() {
		return this.attackBonusPoints;
	}

	public int getDefenseBonusPoints() {
		return this.defenseBonusPoints;
	}

	protected void setAttackBonusPoints(int attackBonus) {
		this.attackBonusPoints = attackBonus;
	}

	protected void setDefenseBonusPoints(int defenseBonus) {
		this.defenseBonusPoints = defenseBonus;
	}


	/** end of DragonLevel02 class. */

}
