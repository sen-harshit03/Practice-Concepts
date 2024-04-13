package generics.genericmethos;

public class Example {

    <T> void method1(T a) {

    }

    <T> T method2(T a) {
        return a;
    }


    static <T> void method3(T a) {
    }

    // Spring getBean
    static <T> T getBean(String beanName, Class<T> classType) {
        return null;
    }

    public static void main(String[] args) {
        method3(10);

        double d = getBean("A", Double.class);
    }
}
