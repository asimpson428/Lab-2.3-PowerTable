import java.util.Scanner;

public class PowerTable {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		
		int answer;
		String choice = "y";
		
		
		
		
			
			System.out.println("Learn your squares and cubes!\n");
			System.out.println("Please enter an integer:");
			answer = scnr.nextInt();
			
			
			
			System.out.println("\nNumber Squared Cubed");
			System.out.println("===== ======= =====");
			
			
			for (int i = 1;i <= answer;i++) {
				System.out.println(i + "" + (i * i)+ "" + (i * i * i));
			}
			
		System.out.println("\nContinue? (y/n):");
		choice = scnr.next();
		System.out.println();
		
		
		if (choice.equals("n")) {
			System.out.println("Thank you for playing!");
		}
		
		
			
			
		
		
		scnr.close();
		
		
		

	
	
	}
		}

