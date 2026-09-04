public class Main {

    public static void main(String[] args) {

        MyInterface obj1 = new OverrideClass();
        obj1.method1();
        obj1.newMethod2();

        System.out.println();

        MyInterface obj2 = new NormalClass();
        obj2.method1();
        obj2.newMethod2();

        System.out.println();

        SubInterface obj3 = new SubClass();
        obj3.method1();
        obj3.newMethod2();
    }
}