package Consumer;

import java.util.function.Consumer;


/**
 Consumer Implementation with lambda expression overriding accept method
 */
public class ConsumerExample  {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (t) -> System.out.println(t);
        consumer.accept(500);
    }
}