import java.util.*;

public class questions {



//     public static void prime(int n){

//         if(n % 2 == 0 ){
//             System.out.println("Even");
//         } else{
//             System.out.println("Not Even");
//         }
//     }
    
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         prime(n);

//     }


// public static void table(int n){

//     for (int i=1; i<=10; i++){
//         System.out.println(i*n);
//     }
// }

// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     table(n);
// }   

    // public static int avg(int a, int b, int c){
    //     double avg = (a + b + c) / 3; 
    //     System.out.println("The average is: " + avg);
    //     return 1;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();

    //     avg(a, b, c);
    // }

    // public static void greaterNumber(int a, int b){

    //     if(a > b){
    //         System.out.println("a is greater: " + a);
    //     } else{
    //         System.out.println("b is greater: " + b);
    //     }
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     greaterNumber(a, b);
    // }

    // public static void circumference(int r){
    //     System.out.println(2 * 3.14 * r );
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     circumference(n);

    // }

    // public static void vote(int age){
        
    //     if(age < 0){
    //         System.out.println("Invalid");
    //     }else{
    //         if(age >= 18){
    //             System.out.println("eligible to vote" );
    //         } else{
    //             System.out.println("not eligible to vote");
    //         }
    //     }
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt();

    //     vote(age);
    // }

    // public static void main(String args[]){

    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int i = 1;

    //     while(i< i){
    //         System.out.print(i);
    //         i++;
    //     }
    // }

    // public static int fibonacci(int n){

    //     if(n == 0){
    //         return 0;
    //     } else if(n == 1){
    //         return 1;
    //     } else{
    //         return fibonacci(n-2) + fibonacci(n - 1);
    //     }
    // }

    // public static void main(String args[]){

    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     for(int i = 0; i<n; i++){
    //         System.out.print(fibonacci(i) + " ");
    //     }
        
    // }

    // public static int factorial(int n) {
    //     if(n == 0 || n == 1) {
    //         return 1;
    //     }


    //     int fact_nm1 = factorial(n-1);
    //     int fact_n = n * fact_nm1;
    //     return fact_n;
    // }

    // public static void main(String[] args) {
        
    //     int ans = factorial(5);
    //     System.out.println(ans);
    // }

    // public static void fibonacci(int a, int b, int n) {
    //     if(n == 0) {
    //         return ;
    //     }

    //     int c = a + b;
    //     System.out.print(c + " ");
    //     fibonacci(b, c,n-1);
    // }

    // public static void main(String[] args) {
        
    //     int a = 0;
    //     int b = 1;
    //     int n = 5;
    //     System.out.print(a + " ");
    //     System.out.print(b + " ");
    //     fibonacci(a, b, n);
    // }

    public static int print(int x,int n)  {
        if(n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        int xPownm1 = print(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {

        int x;
        int n;
        int ans = print(5, 4);
        System.out.println(ans);
    }

}
