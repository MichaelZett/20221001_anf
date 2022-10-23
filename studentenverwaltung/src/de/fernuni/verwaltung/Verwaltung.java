package de.fernuni.verwaltung;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import de.fernuni.mitarbeiter.Mitarbeiter;
import de.fernuni.mitarbeiter.Person;
import de.fernuni.statistik.Monitor;
import de.fernuni.student.Geschlecht;
import de.fernuni.student.Student;

public class Verwaltung {
	private static final Map<UUID, Person> SPEICHER = new HashMap<>();

	public UUID studentAnlegen(String vorname, String nachname, Geschlecht geschlecht) {
		System.out.println("Anzahl Studenten vorher: " + Monitor.showNumberOfStudents());
		Student einStudent = new Student(vorname, nachname, geschlecht);
		SPEICHER.put(einStudent.getId(), einStudent);
		System.out.println("Anzahl Studenten nachher: " + Monitor.showNumberOfStudents());
		return einStudent.getId();
	}

	public Student getStudent(UUID id) {
		Person idBesitzer = SPEICHER.get(id);
		if (idBesitzer instanceof Student s) {
			return s;
		}
		// früher
//		if (idBesitzer instanceof Student) {
//			return (Student) idBesitzer;
//		}
		return null;
	}

	public UUID mitarbeiterAnlegen(String vorname, String nachname, Geschlecht geschlecht) {
		Mitarbeiter einMA = new Mitarbeiter(vorname, nachname, geschlecht);
		SPEICHER.put(einMA.getId(), einMA);
		return einMA.getId();
	}

	public Mitarbeiter getMitarbeiter(UUID id) {
		Person idBesitzer = SPEICHER.get(id);
		if (idBesitzer instanceof Mitarbeiter m) {
			return m;
		}
		return null;
	}

	public void lassMachen() {
		for (Person p : SPEICHER.values()) {
			p.machWas();
		}

	}
}
