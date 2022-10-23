package fizzbuzz;

public class FizzBuzzGame {

	public static void main(String[] args) {
		int lastNumber = 100;
		if (args.length > 0) {
			try {
				lastNumber = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.out.println(
						"Als Programmargument wird eine Zahl erwartet." + " Ich mache mit default 100 weiter.");
			}
		}
		int fizzNumber = 3;
		int buzzNumber = 5;
		for (int i = 1; i <= lastNumber; i++) {
			if (i % fizzNumber == 0 && i % buzzNumber == 0) {
				System.out.print("FizzBuzz");
			} else if (i % fizzNumber == 0) {
				System.out.print("Fizz");
			} else if (i % buzzNumber == 0) {
				System.out.print("Buzz");
			} else {
				System.out.print(i);
			}

			if (i != lastNumber) {
				System.out.print(", ");
			}
		}

	}

}
