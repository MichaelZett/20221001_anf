package de.fernuni.verwaltung;

import de.fernuni.student.Geschlecht;

public class VerwaltungAnwendung {
	private Verwaltung verwaltung = new Verwaltung();

	public static void main(String[] args) {
		new VerwaltungAnwendung().doSomething();
	}

	private void doSomething() {
		verwaltung.studentAnlegen("Peter", "Müller", Geschlecht.M);
		verwaltung.studentAnlegen("Annika", "Meyer", Geschlecht.W);
	}

}
