package week2;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		String says = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give a name to the dog: ");
		name = scan.nextLine();
		
		Dog dog = new Dog(name);
		
		while (says.trim().isEmpty()) {
			System.out.print("What does a dog say: ");
			says = scan.nextLine();
			dog.speak(says);
		}
		
		scan.close();
	}

}
