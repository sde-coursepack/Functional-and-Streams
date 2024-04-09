package mcburney.edu.functional.sorting;

import mcburney.edu.functional.Student;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}

}
