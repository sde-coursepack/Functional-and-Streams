package mcburney.edu.functional;

import java.util.ArrayList;
import java.util.List;

public class TestStudentList {
    public static List<Student> getTestStudentList() {
        List<Student> slist = new ArrayList<>();
        slist.add(new Student("Aaron", "Aaronson", 3.5, Level.UNDERGRAD));
        slist.add(new Student("Betty", "Black", 2.7, Level.UNDERGRAD));
        slist.add(new Student("Chuck", "Carter", 3.8, Level.GRAD));
        slist.add(new Student("Debby", "Davis", 3.8, Level.UNDERGRAD));
        slist.add(new Student("Eddie", "Edwards", 2.0, Level.PART_TIME));
        slist.add(new Student("Frank", "Frederick", 4.0, Level.UNDERGRAD));
        slist.add(new Student("Greta", "Green", 3.6, Level.GRAD));
        slist.add(new Student("Harry", "Horton", 1.3, Level.UNDERGRAD));
        return slist;
    }
}
