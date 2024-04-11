package mcburney.edu.functional.sorting;

import mcburney.edu.functional.Level;
import mcburney.edu.functional.Student;
import mcburney.edu.functional.TestStudentList;

import java.util.Collections;
import java.util.List;

public class StudentSortDemo {
    public static void main(String[] args) {

        List<Student> studentList = TestStudentList.getTestStudentList();

        //adding additional students for testing sorting on multiple criteria
        studentList.add(new Student("Greta", "Green", 3.2, Level.UNDERGRAD));
        studentList.add(new Student("Zelda", "Aaronson", 3.51, Level.UNDERGRAD));

        Collections.sort(studentList);

        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}
