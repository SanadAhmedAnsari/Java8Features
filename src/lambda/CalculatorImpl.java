package lambda;



interface Calculator{
    void switchOn();
}


/**
Traditional way of doing implementation
 */
/*
public class CalculatorImpl implements Calculator{
    @Override
    public void switchOn(){
        System.out.println("Swithc On");
    }
}*/

/**
 Lambda (anonymous) way of doing implementation
 */
/*
public class CalculatorImpl {
    public static void main(String[] args) {
        Calculator calculator = () -> {
            System.out.println("Swithc On");
        };
        calculator.switchOn();
    }
}*/


public class CalculatorImpl {
    public static void main(String[] args) {
        Calculator calculator = () -> System.out.println("Swithc On");
        calculator.switchOn();
    }
}