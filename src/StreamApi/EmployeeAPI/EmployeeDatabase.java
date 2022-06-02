package StreamApi.EmployeeAPI;

import java.util.*;
import java.util.concurrent.RecursiveTask;

public class EmployeeDatabase {

    public static List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(176, "Roshan", "IT", 60000L));
        employeeList.add(new Employee(167, "Sandy", "CIVIL", 30000L));
        employeeList.add(new Employee(1123, "Tiwari", "DEFENCE", 70000L));
        employeeList.add(new Employee(142, "John", "CORE", 120000L));
        employeeList.add(new Employee(165, "Apple", "SOCIAL", 90000L));
        return  employeeList;
    }

    public  static Map<Employee, Integer> getEmployeeMap(){
        Map<Employee, Integer> employeeMap = new TreeMap<>(Comparator.comparing(Employee::getSalary));
        employeeMap.put((new Employee(176, "Roshan", "IT", 60000L)), 60);
        employeeMap.put((new Employee(167, "Sandy", "CIVIL", 30000L)), 90);
        employeeMap.put((new Employee(1123, "Tiwari", "DEFENCE", 70000L)), 25);
        employeeMap.put((new Employee(142, "John", "CORE", 120000L)), 34);
        employeeMap.put((new Employee(165, "Apple", "SOCIAL", 90000L)), 24);

        return employeeMap;
    }
}
