package interfaceD.example4;

public class Driver {
    public static void main(String[] args) {
        ServiceA a = new ServiceImpl();
        a.abstractM1();

        ServiceB b = new ServiceImpl();
        b.abstractM1();
    }
}
