package StreamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class FilterAndForEachInListAndMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mac");
        list.add("Mike");
        list.add("Arnold");
        list.add("Lewis");
        list.add("Dev");
        list.add("Manmohan");
        list.add("Sandy");

        /**
         * ForEach accepts consumer/biConsumer
         */



        // Traditional way of doing filter in list
        for(String s : list){
            if(s.toLowerCase().startsWith("m")){
                System.out.println(s);
            }
        }
        // passing predicate explicitly
        Predicate<String> predicate = (t) -> t.toLowerCase().startsWith("m");
        list.stream().filter(predicate).forEach(System.out :: println);

        // Stream way of filter in list inline
        list.stream().filter(t -> t.toLowerCase().startsWith("m")).forEach(System.out :: println);

        /**
         * Filter accepts predicate
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "to");
        map.put(3, "The");
        map.put(4, "Java");
        map.put(5, "World");

        //forEach in map
        map.forEach((k, v) -> System.out.println("Key: " + k + "value: " + v));
        map.entrySet().forEach(System.out:: println);
        //filter in map
        System.out.println("*****************");
        map.entrySet().stream().filter(k -> k.getValue().equals("The")).forEach(System.out::println);
    }
}
