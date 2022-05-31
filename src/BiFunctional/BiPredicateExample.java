package BiFunctional;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    //test,and,or,negate
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };

        System.out.println(biPredicate.test("hello", "hello"));
        BiPredicate<String, String> biPredicate2 = (s1, s2) -> s1.equals(s2);
        System.out.println( biPredicate2.test("Hello", "hello"))                      ;

    }
}
