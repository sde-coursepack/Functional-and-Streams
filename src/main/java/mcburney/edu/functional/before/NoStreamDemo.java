package mcburney.edu.functional.before;

import mcburney.edu.functional.Level;
import mcburney.edu.functional.Student;
import mcburney.edu.functional.TestStudentList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NoStreamDemo {

    public static final double DEANS_LIST_MINIMUM_GPA = 3.5;

    /**
     * Given a list of all students, print the Dean's List with GPAs
     * Dean's list is all undergrad students with a >= 3.5 GPA
     * The list should be printed by GPA in descending order
     */

    public static void main(String[] args) {
        List<Student> studentList = TestStudentList.getTestStudentList();

        //Filter - get list of only undergrad students
        List<Student> undergrads = new ArrayList<>();
        for (Student s: studentList) {
            if (s.getLevel().equals(Level.UNDERGRAD)) {
                undergrads.add(s);
            }
        }

        //Filter - get students with sufficient GPA for Dean's List
        List<Student> deansList = new ArrayList<>();
        for (Student student: undergrads) {
            if (student.getGpa() >= DEANS_LIST_MINIMUM_GPA) {
                deansList.add(student);
            }
        }

        // Sorted -> Sort the Deans List by GPA in descending order
        deansList.sort(new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getGpa(), o1.getGpa());
            }
        });

        // Map -> Get the correct printout format as a String for each student
        List<String> undergradNameAndGPAs = new ArrayList<>();
        for (Student student : deansList) {
            undergradNameAndGPAs.add(String.format("%-20s - %1.2f",
                    student.getCombinedName(), student.getGpa()));
        }

        // ForEach -> Display the printout
        for (String name : undergradNameAndGPAs) {
            System.out.println(name);
        }
    }

}
