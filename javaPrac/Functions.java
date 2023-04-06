import java.util.*;

public class Functions {

    // public static void printMyName(String name) {
    //     System.out.println(name);
    //     return;
    // }
    
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name);
    // }

    // public static int calculateSum(int a, int b) {
    //     int sum  = a + b;
    //     return sum;
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum  = calculateSum(a , b);
    //     System.out.println(sum);
    // }


    // public static int calculateProduct(int a, int b) {
    //     int product  = a * b;
    //     return product;
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int product  = calculateProduct(a , b);
    //     System.out.println(product);
    // }

    public static void printFactorial(int n) {

        if(n<0){
            System.out.println("Invalid Number");
        }
        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}
