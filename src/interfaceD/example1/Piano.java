package interfaceD.example1;

public class Piano implements Iplayable {

    String model = "yamaha";

    @Override
    public void play() {
        System.out.println("Playing piano...");
    }

    @Override
    public void method1() {
        System.out.println("Mera impln");
        Iplayable.super.method1();
    }
}
