package helloworld;

import java.util.Scanner;

public class GeradOderUngerade {

	public static void main(String[] args) {
		System.out.println("Gib eine Zahl ein!");

		Scanner scanner = new Scanner(System.in);

		int zahl = scanner.nextInt();

		if (zahl % 2 == 0) {
			System.out.println("Gerade!");
		} else {
			System.out.println("Ungerade!");
		}

		scanner.close();
	}

}
