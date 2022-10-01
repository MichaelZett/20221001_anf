package helloworld;

public class Konvertieren {

	public static void main(String[] args) {
		// Typinferenz bei lokalen Variablen (Java10)
		var variable = "";
		// EMailAusgangsManagerTool<Parameter> --> var ist da leserlicher
		// Java 15 Textblock:
		String textblock = """
				Das ist ein Textblock
				und sieht viel besser aus
				als früher ohne die ganzen Umbrüche.
				""";
		System.out.println(textblock);

		String text = "";
		text = String.valueOf(4);

		// L dahinter -> Long Literal, sonst int
		// (type) -> casten
		int zahl = (int) 9999999L;
		System.out.println(zahl);

		// F dahinter -> Float Literal, sonst double
		double kommazahl = 3.141F;
	}

}
