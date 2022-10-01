package helloworld;

public class WhileDoWhile {

	public static void main(String[] args) {
		boolean gefunden = true;

		while (!gefunden) {
			System.out.println("Ich suche....");
		}

		do {
			System.out.println("Ich suche....");
		} while (!gefunden);

	}

}
