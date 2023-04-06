import java.util.Scanner;

// class Arithmetic {
//     public static int add(int a, int b) {
//         int sum  = a + b;
//         return sum;
//     }
// }

// class Adder extends Arithmetic {
    
// }

// interface AdvancedArithmetic{
//     int divisor_sum(int n);
//   }

class MyCalculator {
    public void divisor_sum(int num) {
        System.out.println("I implemented: AdvancedArithmetic");
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;

            }
        }
        System.out.println(sum);
    }
}

public class Solution {
    public static void main(String[] args) {
        // Adder a = new Adder();

        // a.add(10, 32);
        // a.add(10, 3);
        // a.add(10, 10);

        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        MyCalculator cal = new MyCalculator();
        cal.divisor_sum(sum);
        
    }
}
