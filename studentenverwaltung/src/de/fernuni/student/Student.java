package de.fernuni.student;

public class Student {
	public static int anzahl = 0;
	private String vorname;
	private String nachname;

	public Student() {
		anzahl++;
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

}
