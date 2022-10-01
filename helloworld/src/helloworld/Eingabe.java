package helloworld;

import java.util.Scanner;

public class Eingabe {

	public static void main(String[] args) {
		System.out.println("Gib eine Kommazahl ein!");

		Scanner scanner = null;

		scanner = new Scanner(System.in);

		float wert = Float.parseFloat(scanner.next());
//		float wert = scanner.nextFloat();

		System.out.println("Du hast eingegeben: " + wert);

		scanner.close();
	}

}
