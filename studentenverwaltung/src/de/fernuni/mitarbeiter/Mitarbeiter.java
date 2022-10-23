package de.fernuni.mitarbeiter;

import de.fernuni.student.Geschlecht;

public class Mitarbeiter extends Person {
	public Mitarbeiter(String vorname, String nachname, Geschlecht geschlecht) {
		super(vorname, nachname, geschlecht);
	}

	@Override
	public String toString() {
		return "Mitarbeiter [id=" + id + ", vorname=" + vorname + ", nachname=" + nachname + ", geschlecht="
				+ geschlecht + "]";
	}

	@Override
	public void machWas() {
		System.out.println("Ich mitarbeite...");

	}

}
