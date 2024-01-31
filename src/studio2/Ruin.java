package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting ammount of money?" );
		int startAmount = in.nextInt();
		
		int startAmountOG = startAmount;
		
		System.out.println("What is your chance of winning this game?" );
		double winChance = in.nextDouble();
		
		System.out.println("What is your win limit?" );
		int winLimit = in.nextInt();
		
		System.out.println("How many simulations?" );
		int totalSimulations = in.nextInt();
		
		for (int i = 0 ; i < totalSimulations ; i = i + 1 ) {
			
		startAmount = startAmountOG;
				
		while (startAmount > 0 && startAmount < winLimit) {
double w = Math.random();
int x = 0;
			if ( w < winChance) {
				startAmount = (startAmount + 1);
String status = "Win";		
			}
			else{
			startAmount = (startAmount - 1);
			
			String status = "Lose";	
			 x=x+1;
			}
			System.out.println("Simulation " +i+ ": " +x+ " status");
			
		System.out.println("Today's winings are " + +startAmount+++"$");
	}
		
	}
	}}
