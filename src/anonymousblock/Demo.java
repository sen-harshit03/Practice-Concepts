package anonymousblock;

/**
 *  Static blocks -> Anonymous block -> Constructor
 */
public class Demo {

    final String name;
    static int age;
    int salary;
    final static String DEPARTMENT;




    static {
        age = 22;
        System.out.println("Static block A");
    }

    {
        salary = 3000;
        System.out.println("Salary : " + salary);
    }

    {
        System.out.println("Anonymous block B");
    }

    public Demo() {
        name = "harshit";
        System.out.println("Name : " + name);
    }

    static {
        DEPARTMENT = "IT";
        System.out.println("Department: " + DEPARTMENT);
    }

}
