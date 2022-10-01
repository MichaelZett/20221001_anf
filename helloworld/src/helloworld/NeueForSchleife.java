package helloworld;

import java.util.ArrayList;

public class NeueForSchleife {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		liste.add("Peter");
		liste.add("Frauke");
		liste.add("Birgit");
		liste.add("Harald");

		for (String name : liste) {
			System.out.println(name);
		}
		System.out.println("------------");
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
	}

}
