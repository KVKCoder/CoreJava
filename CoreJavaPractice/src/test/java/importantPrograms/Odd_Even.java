package importantPrograms;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Number");
		
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			
			System.out.println("It is an even number");
			
		}
		
		else {
			System.out.println("It is an Odd number");
		}
	
	}

}
