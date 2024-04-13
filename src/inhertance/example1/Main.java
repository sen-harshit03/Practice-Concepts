package inhertance.example1;


/**
 * If a class extends any other class, it can do 4 operations
 * 1. Add new fields
 * 2. Add its own new behavior
 * 3. Change the extended object field (if allowed)
 * 4. Change the extended object behavior  (if allowed)  -> Overriding Method
 */

/**
 * During overriding of a method, we can change are:
 *   - return type
 *   - Access modifier
 *
 *
 * 1. We can not change the return type of the method. (in case of primitive)
 *
 * 2. But we can change the return type of the method if return type is an object, but the changed return type should
 *   be the child class of the superclass return type. i.e Number -> Integer (Integer extends Number)
 *
 * 3. During overriding we can not change the access modifier of the method to its lower access modifier.
 *    Accessibility: public > protected > default > private
 *
 *    eg. public (superclass) -> public (subclass)
 *        protected (superclass) -> protected, public (subclass)
 *        default (superclass) -> default, protected, public (subclass)
 *
 * 4. While overriding a method that throws some exception, the override method:
 *    - May or may not throw the exception.
 *    - Can throw the same exception, or the exceptions which have IS A relation with the exception thrown in parent class.
 *    - Cannot throw any other exception.
 *
 *    superclass -> IOException
 *    subclass ->
 *    valid : No Exception / IOException/ FileNotFoundException
 *    invalid : Exception
 *
 *    FileNotFoundException -> IOException -> Exception
 *
 * 5. We cannot override static and private methods, that would be method hiding.
 *
 *
 */


public class Main {
    public static void main(String[] args) {
        Truck tr = new Truck();

//        System.out.println(tr.tyres);
//        System.out.println(tr.engine);
//        System.out.println(tr.vehicleName());
//        tr.getType();

        System.out.println(tr.getTyresCount());

        Vehicle vehicle = new Truck();
        vehicle.staticMethod();

    }
}
