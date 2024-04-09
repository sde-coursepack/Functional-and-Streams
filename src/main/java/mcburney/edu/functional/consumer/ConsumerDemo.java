package mcburney.edu.functional.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);


        //print each element using for-loop with implicit iterator
        for (Integer i : intList) {
            System.out.println(i);
        }

        //print each element using anonymous class
        intList.forEach(
                new Consumer<Integer>() {
                    public void accept(Integer i) {
                        System.out.println(i);
                    }
                });


        //print each element using lambda body
        intList.forEach(i -> System.out.println(i));


        // Supplier example
        Supplier<ArrayList<String>> listFactory = ArrayList<String>::new;
        ArrayList<String> temp = listFactory.get();
    }
}
