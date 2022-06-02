package StreamApi;

import StreamApi.CustomerAPI.Customer;
import StreamApi.CustomerAPI.CustomerDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

    public static void main(String[] args) {
        List<Customer> customers = CustomerDataBase.getAllCustomers();

        //mapping customer emails into new list of strings
        List<String> customerEmails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(customerEmails);

        //map return stream of stream (list of list)
        List<List<String>> customerPhoneNumbers = customers.stream().map(Customer :: getPhoneNumbers).collect(Collectors.toList());
        System.out.println(customerPhoneNumbers);

        //Single stream
        List<String> customerPhoneNumbersInSingleList =
                customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(customerPhoneNumbersInSingleList);
    }
}
