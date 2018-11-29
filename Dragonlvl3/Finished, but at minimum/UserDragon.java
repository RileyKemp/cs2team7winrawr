package dragonproject;

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

			System.out.println( "\n"+"Now we will set "+this.getName() +"'s parameters." +"\n");
			System.out.print("From 0 to " + this.getBasePoints() +
					" please enter how much attack bonus you would like: " +"\n");
			this.setAttackBonusPoints(input.nextInt());
			System.out.println(this.getName() + " has an attack bonus of: "
					+ this.getAttackBonusPoints());

		
			this.setDefenseBonusPoints(this.getBasePoints()-this.getAttackBonusPoints());
			System.out.println(this.getName() + " has an defense bonus of: "
					+ this.getDefenseBonusPoints() +"\n");

			input.close();

			this.setInitialHealth();
			
		}


		private void NameTheDragon(String nextLine) {
			this.setName(nextLine);

		}



}
