package fizzbuzz;

public class FizzBuzzGame {

	private static final int DEFAULT_LAST_NUMBER = 100;
	private static final int FIZZ_NUMBER = 3;
	private static final int BUZZ_NUMBER = 5;

	public static void main(String[] args) {
		int lastNumber = DEFAULT_LAST_NUMBER;
		if (args.length > 0) {
			try {
				lastNumber = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.out.println("Als Programmargument wird eine Zahl erwartet. Ich mache mit default 100 weiter.");
			}
		}
		for (int i = 1; i <= lastNumber; i++) {
			if (i % FIZZ_NUMBER == 0 && i % BUZZ_NUMBER == 0) {
				System.out.print("FizzBuzz");
			} else if (i % FIZZ_NUMBER == 0) {
				System.out.print("Fizz");
			} else if (i % BUZZ_NUMBER == 0) {
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
