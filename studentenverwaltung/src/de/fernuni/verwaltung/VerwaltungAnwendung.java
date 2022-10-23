package de.fernuni.verwaltung;

import java.util.UUID;

import de.fernuni.student.Geschlecht;
import de.fernuni.student.Student;

public class VerwaltungAnwendung {
	private Verwaltung verwaltung = new Verwaltung();

	public static void main(String[] args) {
		new VerwaltungAnwendung().doSomething();
	}

	private void doSomething() {
		verwaltung.studentAnlegen("Peter", "Müller", Geschlecht.M);
		UUID annikasId = verwaltung.studentAnlegen("Annika", "Meyer", Geschlecht.W);
		Student annika = verwaltung.getStudent(annikasId);
		System.out.println("Student Annika: " + annika);
	}

}
