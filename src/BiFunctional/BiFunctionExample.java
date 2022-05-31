package BiFunctional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {
    @Override
    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
        return Stream.of(list1, list2)
                .flatMap(List :: stream)
                .distinct()
                .collect(Collectors.toList());
    }

    //apply, andThen
    public static void main(String[] args) {
        BiFunction biFunction = new BiFunctionExample();
        List<Integer> list1 = Stream.of(1,3,5,7,9).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(35,7,9).collect(Collectors.toList());
        System.out.println("Traditional way::" + biFunction.apply(list1, list2));
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction1 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
                return Stream.of(integers, integers2)
                        .flatMap(List :: stream)
                        .distinct()
                        .collect(Collectors.toList());
            }
        };
        System.out.println("Anonymoys way::" + biFunction1.apply(list1, list2));


        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = ( integers, integers2) -> {
             return Stream.of(integers, integers2)
                    .flatMap(List :: stream)
                    .distinct()
                    .collect(Collectors.toList());
        };

        System.out.println("Lambda way::" + biFunction2.apply(list1, list2));


        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Sanad", 1000);
        employeeMap.put("Rehan", 200);
        employeeMap.put("Salman", 650);

    /*    BiFunction<String, Integer, Integer> biFunction3 = new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer value) {
                return value + 1000;
            }
        };*/
        employeeMap.replaceAll(( s,  value) -> value + 1000);
        System.out.println(employeeMap);
    }
}
