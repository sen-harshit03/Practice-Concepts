package interfaceD.example3;

public class Subclass implements Service1, Service2 {
    @Override
    public void play() {
        Service1.super.play();
    }
}
