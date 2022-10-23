package de.fernuni.student;

import de.fernuni.mitarbeiter.Person;

public class Student extends Person {
	public static int anzahl = 0;

	public Student(String vorname, String nachname, Geschlecht geschlecht) {
		super(vorname, nachname, geschlecht);
		anzahl++;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", vorname=" + vorname + ", nachname=" + nachname + ", geschlecht=" + geschlecht
				+ "]";
	}

	@Override
	public void machWas() {
		System.out.println("Ich studiere...");
	}

}
