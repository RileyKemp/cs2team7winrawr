package dragonproject;
public class TestSimpleDragonBattle {

	public static void main(String[] args) {

		// old
		//SimpleDragon computer1 = new SimpleDragon();
		// new
		// we may want to make the computer's stats hidden.
		DragonLevel02 computer1 = new DragonLevel02();
		System.out.println("Welcome,\n\nhere are the rules: \n"
				+ "you will start with 100 points to add to attack and defense."
				+ "\nboth sides will have 100 health\n\n"
				+ "The Computer's Dragon, " + computer1.getName() +
				", has a health of: " + computer1.getHealth()  +
		",\nHis Attack Bonus is: " + computer1.getAttackBonusPoints()  +
		",\nHis Defense Bonus is: " + computer1.getDefenseBonusPoints() +"\n");

		// make a user controlled dragon

		UserDragon user1 = new UserDragon();
		//System.out.println("hello " + user1.getName() +
		//		", health is: " + user1.getHealth());
		/*System.out.println("hello " + user1.getName() +
				", health is: " + user1.getHealth() +
		", attackBonus is: " + user1.getAttackBonusPoints() +
		", defense is: " + user1.getDefenseBonusPoints());*/
		// make a battle
		SimpleDragonBattle firstBattle = new SimpleDragonBattle();

		// pass the two dragons to the battle
		boolean userWin = firstBattle.simpleBattle(user1, computer1);

		// print off who wins the battle
		firstBattle.printWinner(userWin,user1, computer1);



	}

}
