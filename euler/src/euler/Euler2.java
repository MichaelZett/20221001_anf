package euler;

import java.util.HashMap;

public class Euler2 {
	private static final HashMap<Long, Long> SPEICHER = new HashMap<>();

	public static void main(String[] args) {
//		fibonacciForward();

		Long fibonacci = fibonacci(50L);
		System.out.println("Fibonacci: " + fibonacci);
	}

	private static Long fibonacci(Long zahl) {
		if (zahl == 1L || zahl == 2L) {
			return 1L;
		}

		if (SPEICHER.containsKey(zahl)) {
			return SPEICHER.get(zahl);
		}
		Long result = fibonacci(zahl - 1) + fibonacci(zahl - 2);
		SPEICHER.put(zahl, result);
		return result;
	}

	private static void fibonacciForward() {
		// Initialisiere Stand bei f3
		int endResult = 2;
		int currentResult = 3;
		int lastResult = 2;
		int lastLastResult = 1;

		while (currentResult <= 4_000_000) {
			if (currentResult % 2 == 0) {
				endResult = endResult + currentResult;
			}
			lastLastResult = lastResult;
			lastResult = currentResult;
			currentResult = lastResult + lastLastResult;
		}
		System.out.println("Summe: " + endResult);
	}

}
