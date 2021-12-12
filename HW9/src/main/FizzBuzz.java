package main;

public class FizzBuzz {
	
	public String convertNumber(int number) {
		String r = "";
		if ((number % 5) == 0) {
			r = "Fizz";
		}
		if ((number % 7) == 0) {
			r = (r+"Buzz");
		}
		return r;
	}
}
