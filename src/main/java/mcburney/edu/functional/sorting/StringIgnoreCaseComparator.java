package mcburney.edu.functional.sorting;

import java.util.Comparator;

public class StringIgnoreCaseComparator implements Comparator<String> {
	public int compare(String o1, String o2) {
		return o1.toUpperCase().compareTo(o2.toUpperCase());
	}
}
