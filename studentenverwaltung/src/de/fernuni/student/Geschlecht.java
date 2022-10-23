package de.fernuni.student;

public enum Geschlecht {
	M("männlich"), W("weiblich"), D("divers");

	private final String anzeige;

	private Geschlecht(String anzeige) {
		this.anzeige = anzeige;
	}

	public String getAnzeige() {
		return anzeige;
	}

	@Override
	public String toString() {
		return anzeige;
	}
}
