package interfaceD.example4;

public class ServiceImpl implements ServiceA, ServiceB{

    @Override
    public void abstractM1() {
        System.out.println("Abstract method of ServiceImpl");
        System.out.println(ServiceA.VALUE);
        System.out.println(ServiceB.VALUE);

    }
}
