import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Please select the oposing dragon name:");
	String cpu = input.nextLine();
	

	System.out.print("Please select your dragon name:");
	String name1 = input.nextLine();


		int userroll;
		int cpuroll;

		System.out.println("Please select the number of sides on your dice:");
		int sides = input.nextInt();
System.out.println( name1 + " and " + cpu + " will each roll a " + sides + " sided dice.");
		userroll = (int)(Math.random() * sides +1);
		cpuroll = (int)(Math.random() *sides + 1);
		System.out.println( name1 + " rolled a "+ userroll + " and " + cpu + " Rolled a " + cpuroll + ".");
		if (userroll > cpuroll){
			System.out.println(name1 + " Won!!");
		}
		if (cpuroll > userroll){
			System.out.println(cpu + "The Computer Won!");
		}
		if (cpuroll == userroll){
			System.out.println("There was a Draw");
		}


	}
	
}

