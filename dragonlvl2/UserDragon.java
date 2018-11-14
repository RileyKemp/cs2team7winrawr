package dragonlvl2;

import java.util.Scanner;

public class UserDragon extends DragonLevel02 {

	// user constructor, used by human
		public UserDragon() {

			// initial Parameters
			AskUserForParameters();

		}

		private void AskUserForParameters() {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a name for your dragon: ");
			NameTheDragon(input.nextLine());

			System.out.println("Now we will set dragon parameters.");
			System.out.print("From 0 to " + this.getBasePoints() +
					" please enter how much attack bonus you would like: ");
			this.setAttackBonusPoints(input.nextInt());
			System.out.println(this.getName() + " has an attack bonus of: "
					+ this.getAttackBonusPoints());

			System.out.print("From 0 to " + (this.getBasePoints() - this.getAttackBonusPoints()) +
					" please select how much defense bonus you would like: ");
			this.setDefenseBonusPoints(input.nextInt());
			System.out.println(this.getName() + " has an defense bonus of: "
					+ this.getDefenseBonusPoints());

			input.close();

			this.setInitialHealth();
			System.out.println(this.getName() +
					" has health of: " + this.getHealth() +
					" has an defense bonus of: " + this.getDefenseBonusPoints() +
					" has an attack bonus of: " + this.getAttackBonusPoints());
		}


		private void NameTheDragon(String nextLine) {
			this.setName(nextLine);

		}



}
