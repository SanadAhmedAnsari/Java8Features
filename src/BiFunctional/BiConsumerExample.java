package BiFunctional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Sanad", 1000);
        employeeMap.put("Rehan", 200);
        employeeMap.put("Salman", 650);

        //accept,andThen
        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + " " + integer);
            }
        };
        biConsumer.accept("hello", 100);
        BiConsumer<String, Integer> biConsumer2 = (s, t) -> System.out.println(s + " " + t);
        biConsumer2.accept("Hello from anonymous imple", 100);
        employeeMap.forEach((k,v) -> System.out.println("This is key: " + k + " and this is value: " + v));
    }
}
