package mcburney.edu.functional.after;

import mcburney.edu.functional.Level;
import mcburney.edu.functional.Student;
import mcburney.edu.functional.TestStudentList;

import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Student> slist =                 TestStudentList.getTestStudentList();
        var output = slist.stream()
                .filter(student -> student.getLevel() == Level.UNDERGRAD)
                .map(student -> student.getLastName())
                .reduce("", (subString, element) -> subString + " " + element);
        System.out.println(output);
    }
}
