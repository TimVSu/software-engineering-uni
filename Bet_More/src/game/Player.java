package game;

public class Player {
	public int score;
	
	
	public int play() {
		BetMoreGame bet = new BetMoreGame();
		this.score = bet.pickCard();
		return this.score;
	}
	
	
	
	
}
