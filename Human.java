package game;

import java.util.Scanner;

public class Human extends Player{
	public BetMoreGame bet = new BetMoreGame();
	
	@Override
	public int play() {
		
		boolean userSelected = false; 
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while (userSelected == false && i <= 5) {
			this.score = bet.pickCard(); 
			int l = 6-i; 
			System.out.println("your number is " + this.score + ". Do you want to keep this number(y/n)? You have " + l + " tries left");
			
			String e = scan.nextLine();
			if (e == "yes" || e == "y") {
				userSelected = true;
				break;
			}
			else if (e == "no" || e == "n") {
				i++;
			}
			i++;
		}
		return this.score;
	}
}
