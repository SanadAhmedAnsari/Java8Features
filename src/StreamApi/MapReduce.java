package StreamApi;

import StreamApi.EmployeeAPI.Employee;
import StreamApi.EmployeeAPI.EmployeeDatabase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapReduce {
    public static void main(String[] args) {

        //Traditional way of summing up elements of an array
        List<Integer> integerList = Stream.of(2,4,6,7,8,2,1 ).collect(Collectors.toList());
        int sumResult = 0;
        for(int integer : integerList){
            sumResult += integer;
        }
        System.out.println(sumResult);

        //mapReduce way of doing the same task of internal sum
        System.out.println(integerList.stream().mapToInt(i -> i).sum());

        //
        System.out.println(integerList.stream().reduce(0, (a,b) -> a-b));

        Optional<Integer> optionalInteger = integerList.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.orElse(0));

        Optional<Integer> maxValue = integerList.stream().reduce(Integer::max);
        System.out.println(maxValue.orElse(1));


        List<Employee> employees = EmployeeDatabase.getEmployeeList();

        double avgSalary = employees.stream()
                .filter(employee -> employee.getDept().equals("CIVIL"))
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();

        System.out.println(avgSalary);

    }
}
