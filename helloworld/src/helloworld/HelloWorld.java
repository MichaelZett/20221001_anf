package helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		String text = "text";
		char buchstabe = 'c';
		// groß-geschriebene "primitive Typen" = Wrapperklassen
		boolean logischerAusdruck = Boolean.TRUE;
		byte kleinsteGanzzahl = Byte.MAX_VALUE;
		// ab hier signed
		short kleineGanzzahl = Short.MAX_VALUE;
		int ganzzahl = Integer.MAX_VALUE;
		long grosseGanzzahl = Long.MAX_VALUE;
		float kommazahl = Float.MAX_VALUE;
		double grosseKommazahl = Double.MAX_VALUE;

		System.out.println(text);
		System.out.println(buchstabe);
		System.out.println(logischerAusdruck);
		System.out.println(kleinsteGanzzahl);
		System.out.println(kleineGanzzahl);
		System.out.println(ganzzahl);
		System.out.println(grosseGanzzahl);
		System.out.println(kommazahl);
		System.out.println(grosseKommazahl);
	}
}
