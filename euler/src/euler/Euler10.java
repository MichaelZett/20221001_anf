package euler;

public class Euler10 {

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 2; i < 2_000_000; i++) {
			if (isPrime(i)) {
				sum = sum + i;
			}
		}
		System.out.println("Summe: " + sum);
	}

	private static boolean isPrime(long zahl) {
		if (zahl == 2L) {
			return true;
		}
		if (zahl % 2 == 0) {
			return false;
		}

		for (int i = 3; i < Math.sqrt(zahl) + 1; i++) {
			if (zahl % i == 0) {
				return false;
			}
		}
		return true;
	}

}
