package studentenverwaltung;

public class Verwaltung {

	public static void main(String[] args) {
		Student peter = new Student();
		peter.setNachname("Müller");
		peter.setVorname("Peter");

		System.out.println("Student: " + peter.getVorname() //
				+ " " + peter.getNachname());
	}

}
