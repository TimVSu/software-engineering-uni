package game;

public class BetMoreGame {
	
	public int pickCard() {
		Shuffle s = new Shuffle();
		return s.shuffle(1, 100);
	}
		
	public String findWinner(Player computer, Player player) {
		if (computer.score < player.score) {
			return "win";
			}
			else if (computer.score == player.score) {
			return "draw";
			}
			
			else {
				return "loss";
			}
		}
	}
		
