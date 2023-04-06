import java.util.*;

// import Bank.*;

class Shape {
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h) {
        System.out.println((l*h)/2);
    }
}

// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h) {
//         System.out.println(1/2*l*h);
//     }
// }

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Triangle t1 = new Triangle();
        // Circle c1 = new Circle();
        // // t1.color = "red";
        // // t1.area();
        // t1.area(4, 5);
        // c1.area(2);

        // Bank.Account account1 = new Bank.Account();
        // account1.name = "customers1";
    }
}
