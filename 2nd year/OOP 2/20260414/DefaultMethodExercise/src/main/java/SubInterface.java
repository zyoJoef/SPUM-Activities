public interface SubInterface extends MyInterface {

    @Override
    default void newMethod2() {
        System.out.println("Default implementation in SubInterface");
    }
}