package lambda;

@FunctionalInterface
public interface MyFunctionalInterface {
    void m1();
    //can contain default and static method but should have only one abstract method

    default void m2(){
        System.out.println("first default method");
    }

    default  void m3(){
        System.out.println("Second default method");
    }

    public static void m4(){
        System.out.println("Static method");
    }

}
