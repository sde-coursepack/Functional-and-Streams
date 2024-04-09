package mcburney.edu.functional.sorting;

import mcburney.edu.functional.Level;
import mcburney.edu.functional.Student;
import mcburney.edu.functional.TestStudentList;

import java.util.Collections;
import java.util.List;

public class StudentSortDemo {
    public static void main(String[] args) {

        List<Student> slist = TestStudentList.getTestStudentList();

        //adding additional students for testing sorting on multiple criteria
        slist.add(new Student("Greta", "Green", 3.2, Level.UG));
        slist.add(new Student("Zelda", "Aaronson", 3.51, Level.UG));

        Collections.sort(slist);

        System.out.println(slist);
    }
}
