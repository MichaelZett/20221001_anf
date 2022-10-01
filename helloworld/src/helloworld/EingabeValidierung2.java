package helloworld;

import java.util.Scanner;

public class EingabeValidierung2 {

	public static void main(String[] args) {
		System.out.println("Gib eine Kommazahl ein!");

		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			System.out.println("Zwar keine Kommazahl, " //
					+ "aber ich bin ja nicht so!");
			int wert = scanner.nextInt();
			System.out.println("Du hast eingegeben: " + wert);
		} else if (scanner.hasNextFloat()) {
			float wert = scanner.nextFloat();
			System.out.println("Du hast eingegeben: " + wert);
		} else {
			System.out.println(scanner.next() + " ist keine Zahl!");
		}

		scanner.close();
	}

}
