package haden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week10_Q02 {

    public static void main(String[] args) {


        /**
         Write a method that can sort the ArrayList in descending order without using the sort method
         */

        List<Integer> list = new ArrayList<>(Arrays.asList(12,3,46,7,111,232,3,5,66));

        SortingArrayListDesc(list);
    }

    public static void SortingArrayListDesc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

}
