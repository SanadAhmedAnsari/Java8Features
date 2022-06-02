package StreamApi;

import StreamApi.CustomerAPI.Customer;
import StreamApi.CustomerAPI.CustomerDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) throws Exception {

        /// if thre are n number of properties of an object we can't check every propety for null
        // there we can use Optional of that object

        //Three ways of creating optional object

        //of
        //ofNullable
        //empty


        Customer customer = new Customer(101, "Shiv", "shivsubudi@gmail.com", Arrays.asList("342336", "6654"));

        Customer customer2 = new Customer(101, "Shiv", null, Arrays.asList("342336", "6654"));

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //Optional<String> emailOptional = Optional.of(customer2.getEmail());
        //This will give NPE
        //System.out.println(emailOptional);

        Optional<String> emailOptionalNullable = Optional.ofNullable(customer2.getEmail());
        //System.out.println(emailOptionalNullable.get());
        //to avoid no value present exception above
        //do this way

        if(emailOptionalNullable.isPresent()){
            System.out.println(emailOptionalNullable.orElse("Nothing is there"));
        }

        //findAny takes optional

        System.out.println(getCustomerByEmailId("sanadkhan@gmail.com"));


    }
    public static Customer getCustomerByEmailId(String email) throws  Exception{
        List<Customer> customerList = CustomerDataBase.getAllCustomers();
       return customerList
                .stream()
                .filter(customer1 -> customer1.getEmail().equals(email))
                .findAny().orElseThrow(() -> new Exception("No customer with given Email"));
    }
}
