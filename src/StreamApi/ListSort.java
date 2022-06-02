package StreamApi;

import StreamApi.EmployeeAPI.Employee;
import StreamApi.EmployeeAPI.EmployeeDatabase;

import java.util.*;
import java.util.stream.Collectors;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(-5343);
        integerList.add(8621);
        integerList.add(9621);
        integerList.add(2621);
        integerList.add(6621);
        integerList.add(3621);

        System.out.println(integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        List<Employee> employees = EmployeeDatabase.getEmployeeList();

        /**Traditional way of sorting non primitive list by passing comparator*/
        Collections.sort(employees, new MyComparator());
        System.out.println(employees);

        /**Anonymous way of passing comparator interface implementation to non primitive list in sorting **/
        Collections.sort(employees, new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(employees);

        /** Lambda way of passing comparator interface implementation to non primitive list in sorting **/
        Collections.sort(employees, Comparator.comparing(Employee::getDept));
        System.out.println(employees);

        /**Stream api way of sorting non primitive list **/
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

    }
}
class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
