import java.util.Scanner;
public class diceGame {

	public static void main(String[] args) {
		int userroll;
		int cpuroll;

		System.out.println("Please select the number of sides on your dice:");
		Scanner scan = new Scanner(System.in);
		int sides = scan.nextInt();
System.out.println("you and the computer will each roll a " + sides + " sided dice.");
		userroll = (int)(Math.random() * sides +1);
		cpuroll = (int)(Math.random() *sides + 1);
		System.out.println("You rolled a "+ userroll + " and the Computer Rolled a " + cpuroll + ".");
		if (userroll > cpuroll){
			System.out.println("You Won!!");
		}
		if (cpuroll > userroll){
			System.out.println("The Computer Won!");
		}
		if (cpuroll == userroll){
			System.out.println("There was a Draw");
		}


	}

}
