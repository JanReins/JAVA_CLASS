//method overloading

import javax.swing.text.html.ObjectView;

public class OverloadDemo {
    void test() {
        System.out.println("No Parameters");
    }

    // overload test for 1 integer parameter
    void test(int a) {
        System.out.print("a :" + a );
    }

    //overload test for 2 integer parameters
    void test(int a, int b) {
        System.out.print("a: " + a + " b: " + b);
    }

    //overload test for double interger
    double test(double a) {
        System.out.print("a :" + a);
        return a*a;
    }
}

class Overload {
    public static void main(String[] args) { 
        OverloadDemo obj = new OverloadDemo();
        double result;

        obj.test();
        obj.test(10);
        obj.test(20, 30);
        result = obj.test(103.23);
        System.out.println("result of obj.test(103.23): " + result);
    }

}