package de.fernuni.verwaltung;

import de.fernuni.statistik.Monitor;
import de.fernuni.student.Student;

public class Verwaltung {

	public static void main(String[] args) {
		System.out.println("Anzahl Studenten: " + Monitor.showNumberOfStudents());
		Student peter = new Student();
		peter.setNachname("Müller");
		peter.setVorname("Peter");

		Student annika = new Student();
		annika.setNachname("Meyer");
		annika.setVorname("Annika");

		System.out.println("Anzahl Studenten: " + Monitor.showNumberOfStudents());

		System.out.println("Student: " + peter.getVorname() //
				+ " " + peter.getNachname());
	}

}
