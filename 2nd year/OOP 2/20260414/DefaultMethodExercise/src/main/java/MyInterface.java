public interface MyInterface {

    void method1();

    // Default method
    default void newMethod2() {
        System.out.println("Default implementation in MyInterface");
    }
}