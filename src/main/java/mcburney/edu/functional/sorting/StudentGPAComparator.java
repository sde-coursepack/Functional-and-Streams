package mcburney.edu.functional.sorting;

import mcburney.edu.functional.Student;

import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o1.getGpa(), o2.getGpa());
	}
}
