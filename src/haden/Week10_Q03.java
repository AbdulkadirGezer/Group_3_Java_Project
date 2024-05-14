package haden;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Week10_Q03 {

    public static void main(String[] args) {

        /**
         Write a method that can sort the Map by values
         */

        Map<String, Integer> mapp = new LinkedHashMap<>();
        mapp.put("C", 15);
        mapp.put("A", 5);
        mapp.put("K", 55);
        mapp.put("Z", 25);
        mapp.put("W", 75);
        mapp.put("J", 35);
        mapp.put("D", 115);

        System.out.println(sortByValue(mapp));
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap();
        for(Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }

}
