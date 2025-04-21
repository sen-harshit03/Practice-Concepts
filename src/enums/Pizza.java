package enums;

public enum Pizza {
    SMALL,             // public static final Pizza SMALL = new Pizza();
    MEDIUM(10),  // calling parameterized constructor   public static final Pizza MEDIUM = new Pizza(10);
    LARGE;            // calling no-param constructor      public static final Pizza LARGE = new Pizza();

    private int slices;

    Pizza() {

    }
    Pizza(int slices) {
        this.slices = slices;
    }


    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }


}

//public final class Pizza {
//    public static final Pizza SMALL = new Pizza();
//    public static final Pizza MEDIUM = new Pizza(10);
//    public static final Pizza LARGE = new Pizza();
//
//    private Pizza() {
//
//    }

   // private Pizza(int slices) {
//         this.slices = slices;
//    }
//
//}

