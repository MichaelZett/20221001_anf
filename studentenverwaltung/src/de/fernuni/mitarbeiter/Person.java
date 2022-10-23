package de.fernuni.mitarbeiter;

import java.util.UUID;

import de.fernuni.allgemein.IdBesitzer;
import de.fernuni.student.Geschlecht;

public abstract class Person implements IdBesitzer {

	protected final UUID id;
	protected String vorname;
	protected String nachname;
	protected Geschlecht geschlecht;

	public Person() {
		super();
		this.id = UUID.randomUUID();
	}

	public Person(String vorname, String nachname, Geschlecht geschlecht) {
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

	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}

	@Override
	public UUID getId() {
		return id;
	}

	public abstract void machWas();

}