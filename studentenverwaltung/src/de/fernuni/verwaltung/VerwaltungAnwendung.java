package de.fernuni.verwaltung;

public class VerwaltungAnwendung {
	private Verwaltung verwaltung = new Verwaltung();

	public static void main(String[] args) {
		new VerwaltungAnwendung().doSomething();
	}

	private void doSomething() {
		verwaltung.studentAnlegen("Peter", "Müller");
		verwaltung.studentAnlegen("Annika", "Meyer");
	}

}
