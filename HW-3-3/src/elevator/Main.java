package elevator;

public class Main {
	public static void main (String[] args) {
		Elevator e = new Elevator();
		
		e.current_floor = 3;
		e.move_to_floor(7);
		System.out.println(e.current_floor);
	}
	
}
