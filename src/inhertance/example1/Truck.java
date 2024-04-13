package inhertance.example1;



public class Truck extends Vehicle {

    String engine = "500cc";
    int tyres = 8;

    @Override
    String vehicleName() {
        return "Truck";
    }

    Integer getTyresCount() {
        return this.tyres;
    }
    void getType() {
        System.out.println("Heavy Loaded vehicle");
    }

    private void privateMethod() {
        System.out.println(" Vehicle Method1");
    }

    public static void staticMethod() {
        System.out.println("Static method of the truck class");
    }

    public void methodThatThrowsSomeException() {
        System.out.println("Truck class exception");
    }
}

/**
 * public
 * protected
 * default
 * private
 */
