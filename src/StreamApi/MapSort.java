package StreamApi;

import StreamApi.EmployeeAPI.Employee;
import StreamApi.EmployeeAPI.EmployeeDatabase;

import java.net.Inet4Address;
import java.util.*;

public class MapSort {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(6, "Hello");
        map.put(4, "to");
        map.put(2, "The");
        map.put(-1, "Java");
        map.put(0, "World");


        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        Collections.sort(entries, ( o1,  o2) -> o1.getKey().compareTo(o2.getKey()));

        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //One way
        map.entrySet().stream().sorted((a,b) -> a.getKey().compareTo(b.getKey())).forEach(System.out :: println);

        //second way
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out :: println);

        //Third way sort by key
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        //Third way sort by value
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


        //sort by value of non primitive
        Map<Employee, Integer> employeeIntegerMap = EmployeeDatabase.getEmployeeMap();
        employeeIntegerMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee :: getSalary))).forEach(System.out :: println);
    }
}
