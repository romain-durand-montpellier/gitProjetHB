package gitProjetHB;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		
			biggerNumber();	
		
		

	}
	
	
	private static int biggerNumber() {//Return a number typed by the user
		
		//init
		int number1 = -2;
		int number2 = -2;
		int number3 = -2;
		int number = -2;
		int minNumber = -2;
		Scanner reader = new Scanner(System.in);
		

		do //turn until -1 is enter
		{

			minNumber = Math.min(number3, Math.min(number1, number2));
			
		try { 
			System.out.println ("Entrez un nombre: ");
			number = reader.nextInt();
			
			if (number1 > -2 && number2 > -2 && number3 > -2){
				if(number > number1){//if higher than number1
					if (number > number2) {//and higher than number2
						if (number > number3) {//and higher than number3
							number3 = number;//number3 become number
						}
						else number2=number;//else (not higher than number3) number2 become number
					}
					else number1=number;//else (not higher than number3 or 2, number1 become number
				}
				else if (number > number2) {//else if not higher than number1 but higher than number2
					if (number > number3) {//and higher than number3
						number3=number;//number become number2
					}
					else number2=number;//else (not higher than number3) number2 become number
				}
				else if (number > number3) {//else if not higher than number1 and number2 but higher than number3
					number3=number;
				}
			}
			if (number1 == -2) number1 = number;
			else if (number2 == -2) number2 = number;
			else if (number3 == -2) number3 = number;
			
			
			if(number1 > 0){ //if number > 0 print it
				System.out.println (number1);
			}
			if(number2 > 0){
				System.out.println (number2);
			}
			if(number3 > 0){
				System.out.println (number3);
			}
			
			
		  }
		catch (java.util.InputMismatchException e) {
			reader.nextLine();
		    System.out.println("Entr�e non valide !");
		  }
		
		}while (number != -1);
		System.out.println("A bientot");
		return (number);
	}
}
