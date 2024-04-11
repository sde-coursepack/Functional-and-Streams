package mcburney.edu.functional.after;

import mcburney.edu.functional.Level;
import mcburney.edu.functional.Student;
import mcburney.edu.functional.TestStudentList;

import java.util.List;

import static java.util.Comparator.comparing;

public class StreamDemo {

    public static final double DEANS_LIST_MINIMUM_GPA = 3.5;

    public static void main(String[] args) {
        List<Student> studentList = TestStudentList.getTestStudentList();

        studentList.stream()
                .filter(student -> student.getLevel() == Level.UNDERGRAD)
                .filter(student -> student.getGpa() >= DEANS_LIST_MINIMUM_GPA)
                .sorted((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()))
                .map(student -> getDeansListFormat(student))
                .forEach(string -> System.out.println(string));

    }

    private static String getDeansListFormat(Student student) {
        return String.format("%-20s - %1.2f",
                student.getCombinedName(), student.getGpa());
    }
}
