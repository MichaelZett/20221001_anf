package helloworld;

import java.util.Scanner;

public class EingabeValidierungAutoclose {

	public static void main(String[] args) {
		System.out.println("Gib eine Kommazahl ein!");

		float wert = 0.0F;

		try (Scanner scanner = new Scanner(System.in)) {
			wert = Float.parseFloat(scanner.next());
		} catch (NumberFormatException | NullPointerException e) {
			System.out.println("Das war gar keine Kommazahl ");
		}

		System.out.println("Du hast eingegeben: " + wert);

	}

}
