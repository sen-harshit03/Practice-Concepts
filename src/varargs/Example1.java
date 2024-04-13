package varargs;

/**
 *  varargs are denoted as ...
 *  In the m1 method we can pass 0 args, 1 args,... many args.
 *
 *  In the function body we can treat the var args as an array.
 *
 *  A function can only have 1 var-args.
 *  In case of multiple var args we should always have the var-ags at the last.
 *
 */
public class Example1 {
    public static void main(String[] args) {
        m1();
        m1(1);
        m1(1, 2, 3);
    }


    static void m1(int... a) {
        if(a.length > 0) {
            System.out.println(a[0]);
        }
    }

    static void m2(String param1, int... param2) {}
//    static void m2(int... param2, String param1 ) {} // Wrong
}
