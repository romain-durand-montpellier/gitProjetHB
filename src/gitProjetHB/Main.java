package gitProjetHB;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int newNumber=0;
		while (newNumber != -1) {
			newNumber = inputNumber();	
		}
		

	}
	private static int inputNumber() {//Return a number typed by the user
		Integer number = null;
		
		Scanner reader = new Scanner(System.in);
		System.out.println ("Entrez un nombre: ");

		while (number==null)
		{
		try {
			number = reader.nextInt();
		  }
		catch (java.util.InputMismatchException e) {
			reader.nextLine();
		    System.out.println("Entrée non valide !");
		  }
		}
		return (number);
	}
}
