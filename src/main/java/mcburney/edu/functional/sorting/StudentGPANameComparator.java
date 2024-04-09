package mcburney.edu.functional.sorting;

import mcburney.edu.functional.Student;

import java.util.Comparator;

public class StudentGPANameComparator implements Comparator<Student> {
	public int compare(Student s0, Student s1) {
		if (s0.getGpa() == s1.getGpa()) {
			return s0.getLastName().compareTo(s1.getLastName());
		} else {
			return Double.compare(s1.getGpa(), s0.getGpa());
		}
	}
}
