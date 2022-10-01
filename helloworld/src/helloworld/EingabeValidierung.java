package helloworld;

import java.util.Scanner;

public class EingabeValidierung {

	public static void main(String[] args) {
		System.out.println("Gib eine Kommazahl ein!");

		Scanner scanner = new Scanner(System.in);
		float wert = 0.0F;

		try {
			wert = Float.parseFloat(scanner.next());
		} catch (NumberFormatException | NullPointerException e) {
			System.out.println("Das war gar keine Kommazahl " //
					+ " - nochmal bitte!");
			wert = Float.parseFloat(scanner.next());
		} finally {
			scanner.close();
		}

		System.out.println("Du hast eingegeben: " + wert);

	}

}
