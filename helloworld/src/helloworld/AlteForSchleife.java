package helloworld;

public class AlteForSchleife {

	public static void main(String[] args) {
		String[] stringArray = new String[5];

		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = "" + (i + 1);
		}

		for (int i = 0; i < stringArray.length; i++) {
			System.out.println("Index i=" + i + ": " + stringArray[i]);
		}

		for (int i = 0; i < 30; i++) {
			System.out.print("*");
		}
	}

}
