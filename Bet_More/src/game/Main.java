package game;

public class Main {
	public static void main(String[] args) {
		 Player computer = new Player();
		 Player player = new Human();
		 
		 
		 computer.play();
		 player.play();
		 
		 BetMoreGame bet = new BetMoreGame();
		 
		 String result = bet.findWinner(computer, player);
		 
		 if (result == "won") {
			 System.out.println("You Win (´,,•ω•,,)♡" );
		 }
		 
		 else if (result == "draw") {
			System.out.println("Draw (ง •̀_•́)ง ผ(•̀_•́ผ)");
		 }
		 
		 else if (result == "loss"){
				System.out.println("You lose (งᓀ‸ᓂ)ง" + " computer: " + computer.score + " you: " + player.score);
		 }
		 
	}

}
