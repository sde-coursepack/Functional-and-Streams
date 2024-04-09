package mcburney.edu.functional.after;

import mcburney.edu.functional.Level;
import mcburney.edu.functional.Student;
import mcburney.edu.functional.TestStudentList;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class StreamDemo {
    public static void main(String[] args) {
        List<Student> slist = TestStudentList.getTestStudentList();

        slist.stream()
                .filter(student -> student.getLevel() == Level.UG)
                .filter(student -> student.getGpa() >= 3.5)
                .sorted((s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa()))
                .map(StreamDemo::getDeansListFormat)
                .forEach(System.out::println);

    }

    private static String getDeansListFormat(Student student) {
        return String.format("%-20s - %1.2f",
                student.getCombinedName(), student.getGpa());
    }
}
