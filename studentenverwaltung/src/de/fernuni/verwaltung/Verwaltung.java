package de.fernuni.verwaltung;

import de.fernuni.statistik.Monitor;
import de.fernuni.student.Student;

public class Verwaltung {

	public Student studentAnlegen(String vorname, String nachname) {
		System.out.println("Anzahl Studenten vorher: " + Monitor.showNumberOfStudents());
		Student einStudent = new Student(vorname, nachname);
		System.out.println("Student: " + einStudent + " wurde angelegt.");
		System.out.println("Anzahl Studenten nachher: " + Monitor.showNumberOfStudents());
		return einStudent;
	}
}
