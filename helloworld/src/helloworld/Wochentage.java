package helloworld;

import java.util.Scanner;

public class Wochentage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welchen Tag haben wir heute?");
		String day = scanner.next();
		switch (day) {
		case "m":
			System.out.println("Noch 5 Tage...");
			break;
		case "d":
			System.out.println("Noch 4 Tage...");
			break;
		case "i":
			System.out.println("Noch 3 Tage...");
			break;
		case "o":
			System.out.println("Noch 2 Tage...");
			break;
		case "f":
			System.out.println("Morgen ist Wochenende!");
			break;
		default:
			System.out.println("Kenne ich nicht");
			break;
		}

		scanner.close();
	}

}
