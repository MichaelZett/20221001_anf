package de.fernuni.student;

import java.util.UUID;

public class Student {
	public static int anzahl = 0;
	private final UUID id;
	private String vorname;
	private String nachname;
	private Geschlecht geschlecht;

	private Student() {
		anzahl++;
		id = UUID.randomUUID();
	}

	public Student(String vorname, String nachname, Geschlecht geschlecht) {
		this();
		this.vorname = vorname;
		this.nachname = nachname;
		this.geschlecht = geschlecht;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public String toString() {
		return nachname + "," + vorname + " mit id: " + id.toString() + " mit Geschlecht: " + geschlecht.getAnzeige();
	}
}
