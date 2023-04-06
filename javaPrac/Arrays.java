import java.util.Scanner;
import java.util.*;

public class Arrays {

//     public static void sorting(int n){
//         for(int i = 1; i < n; i++){
//             System.out.println(i*i);
//         }
//     }
    
//      public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int numbers[] = new int[n];

//         // int[] marks = new int[6];
//         // marks[0] = 97;
//         // marks[1] = 95;
//         // marks[4] = 91;
//         // // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         for (int i = 1; i < n; i++) {
//             numbers[i] = sc.nextInt();
//         }

//         // int x = sc.nextInt();

//         // for(int i = 0; i < numbers.length; i++){
//         //     if(numbers[i] == x) {
//         //         System.out.println("x found at index: " + i);
//         //     }
//         // } 
//         // for(int i = 1; i < n; i++){
//         //     System.out.println(i*i);
//         // }

//         for(int i =1;i<=n-1;i++){
//             for(int j = 1;j<=n-i; j++){
//                 if(numbers[j] > numbers[j+1]){
//                     int temp = numbers[j];
//                     numbers[j] = numbers[j+1];
//                     numbers[j+1] = temp;
//                 }
//             }
//         }
//     }

public static void sortSquares(int arr[]){
    int n = arr.length;

    // for(int i = 0; i < n; i++)
    // arr[i] = arr[i] * arr[i];

    // Arrys.sort(arr);

    for(int i =1;i<=n-1;i++){
                    for(int j = 1;j<=n-i; j++){
                        if(arr[j] > arr[j+1]){
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
}

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n]; 

    for(int i =1; i<n; i++) {
        arr[i] = sc.nextInt();
    }

    sortSquares(arr);

    for(int i = 0; i < n; i++) {
        System.out.println();
    }

    // sortSquares(arr);
}
}
