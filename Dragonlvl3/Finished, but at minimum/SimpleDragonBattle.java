package dragonproject;

public class SimpleDragonBattle extends D20{
	// default constructor
	public SimpleDragonBattle() {

	}

	public boolean simpleBattle(SimpleDragon user1, SimpleDragon computer1) {
		boolean userWin = false;
		System.out.println("Our hero " + user1.getName() +
				" has health of: " + user1.getHealth());
		System.out.println("Our opponent " + computer1.getName() +
				" has health of: " + computer1.getHealth() +"\n");

		int roundCount = 1;
		int tempPrintAttack;
		while(user1.getHealth() > 0 && computer1.getHealth()>0) {
			System.out.print("Round: " + roundCount + ": ");
			if(user1.getHealth() > 0) {
				tempPrintAttack = user1.attack();
				System.out.println("temp attack: " + tempPrintAttack);
				computer1.setDamage(tempPrintAttack);
			}


			if(computer1.getHealth() > 0) {
				user1.setDamage(computer1.attack());
			}

			System.out.print(user1.getName() + " has health " + user1.getHealth());
			System.out.println( ", " + computer1.getName() + " has health " + computer1.getHealth() +"\n");
			roundCount++;
		}


		if(user1.getHealth()>0) {
			userWin = true;
		}
		System.out.println("The battle is over." +"\n");

		return userWin;
	}

	public void printWinner(boolean userWin, SimpleDragon user1, SimpleDragon computer1) {
		if(userWin) {
			System.out.println("The user and dragon " + user1.getName() +
					" were victorious \nwith remaining health of "
					+ user1.getHealth());
		} else {
			System.out.println("The computer was victorious with remaining health of "
					+ computer1.getHealth());
		}

	}
}
