package StreamApi.CustomerAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDataBase {

    public static List<Customer> getAllCustomers(){
        return Stream.of(
                new Customer(101, "Amit", "amitKhanna@gmail.com", Arrays.asList("123423", "232132")),
                new Customer(101, "Sanad", "sanadkhan@gmail.com", Arrays.asList("98765", "4322")),
                new Customer(101, "Shiv", "shivsubudi@gmail.com", Arrays.asList("342336", "6654")),
                new Customer(101, "Dilip", "dilipsen@gmail.com", Arrays.asList("32423555", "23232"))
                ).collect(Collectors.toList());
    }
}
