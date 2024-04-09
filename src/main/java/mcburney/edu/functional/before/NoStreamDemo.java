package mcburney.edu.functional.before;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NoStreamDemo {
    public static void main(String[] args) {
        List<Student> slist = TestStudentList.getTestStudentList();

        //get undergrads
        List<Student> undergrads = new ArrayList<>();
        for (Student s: slist) {
            if (s.getLevel().equals(Level.UG)) {
                undergrads.add(s);
            }
        }

        //get deansList
        List<Student> deansList = new ArrayList<>();
        for (Student student: undergrads) {
            if (student.getGpa() >= 3.5) {
                deansList.add(student);
            }
        }

        //sort deansList by GPA in descending order
        deansList.sort(new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getGpa(), o1.getGpa());
            }
        });

        //get a List<String> to represent the deans list printout
        List<String> undergradNameAndGPAs = new ArrayList<>();
        for (Student student : deansList) {
            undergradNameAndGPAs.add(String.format("%-20s - %1.2f",
                    student.getCombinedName(), student.getGpa()));
        }

        for (String name : undergradNameAndGPAs) {
            System.out.println(name);
        }
    }

}