public class Recursions {

    // public static void printNumb(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.print(n + " ");
    //     printNumb(n-1);

    // }
    
    // public static void main(String[] args) {
    //     int n = 5;

    //     printNumb(n);
    // }


    // Sum of first N natural numbers

    public static void printSum(int i, int n, int sum) {
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum +=i;
        printSum(i+1, n, sum);
        // System.out.println(i);
    }

    public static void main(String[] args) {
        printSum(1, 5, 0);
    }

    // Factorial of N

    // public static int calcFactorial(int n){
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }

    //     int fact_nm1 = calcFactorial(n-1);
    //     int fact_n = n * fact_nm1;
    //     return fact_n;
    // }

    // public static void main(String[] args) {
    //     int n = 5;
    //     int ans = calcFactorial(n);
    //     System.out.println(ans);
    // }

    // FIBONACCI

    // public static void fibonacci(int a, int b, int n){
    //     if(n == 0) {
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.print(c + " ");
    //     fibonacci(b, c, n-1);
    // }

    // public static void main(String[] args) {
    //     int a = 0;
    //     int b = 1;
    //     System.out.print(a + " ");
    //     System.out.print(b + " ");
    //     int n = 7;
    //     fibonacci(a, b, n-2);
    // }

    // Print X^N

    // public static int calcPower(int x, int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     if(x == 0) {
    //         return 0;
    //     }
    //     int xPownm1 = calcPower(x, n-1);
    //     int xPown = x * xPownm1;
    //     return xPown;
    // }

    // public static void main(String[] args) {
    //     int n = 5;
    //     int x = 2;
    //     int ans  = calcPower(x, n);
    //     System.out.println(ans);
    // }
}
