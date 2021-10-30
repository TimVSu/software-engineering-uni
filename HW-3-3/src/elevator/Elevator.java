package elevator;

public class Elevator {
	
	public int current_floor;
	
	private void go_up() {
		current_floor++;
	}
	
	private void go_down() {
		current_floor--;
	}
	
	private void exit() {
		System.out.println("the doors will open");
	}
	
	private void arrive_at_floor() {
		System.out.println("you\'ve  arrived at floor " + current_floor);
		exit();
	}
	
	public void move_to_floor(int f) {
		int d = f - current_floor;
		if(d >= 0) {
			for(int i = current_floor; i < f; i++) {
				go_up();
			}
			arrive_at_floor();
		}
		else {
			for(int i = current_floor; i > f; i--) {
				go_down();
			}
			arrive_at_floor();
		}
	}
	
}
