package inhertance.example1;

import java.io.IOException;

public class Vehicle {

    int tyres = 4;

    String vehicleName() {
        return "Vehicle";
    }

    Number getTyresCount() {
        return this.tyres;
    }

    public static void staticMethod() {
        System.out.println("Static method of the vehicle class");
    }


    public void methodThatThrowsSomeException() throws IOException {
        System.out.println("Vehicle class exception");
    }

    private void privateMethod() {
        System.out.println(" Vehicle Method1");
    }

}
