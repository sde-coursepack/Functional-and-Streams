package mcburney.edu.functional.sorting;

import java.util.Arrays;
import java.util.List;


/**
 * Sorting Shakespeare by String Length
 */

public class SortingDemo {
    public static void main(String[] args) {
        List<String> soliloquoy = List.of(
                "To be or not to be?, That is the question", 
                "Whether tis nobler in the mind to suffer", 
                "The slings and arrows of outrageous fortune", 
                "or to takes arms against a sea of troubles", 
                "and by opposing, end them. To die, to sleep--", 
                "No more--and by a sleep to say we end", 
                "the heartache, and the thousand natural shocks", 
                "That flesh is heir to. 'Tis a consummation", 
                "Devoutly to be wished. To die, to sleep", 
                "To sleep perchance to dream: ay, there's the rub.");

        soliloquoy.forEach(System.out::println);
    }
}
