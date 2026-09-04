public class OverrideClass implements MyInterface {

    @Override
    public void method1() {
        System.out.println("method1 in OverrideClass");
    }

    @Override
    public void newMethod2() {
        System.out.println("Overridden newMethod2 in OverrideClass");
    }
}