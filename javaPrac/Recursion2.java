public class Recursion2 {
    // public static void towerOfHanoi(int n, String src, String helper, String dest){
    //     if(n == 1){
    //         System.out.println("transfer disk "+ n + " from " + src + " to "+ dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest, helper);
    //     System.out.println("transer disk " + n + " from " + src + " to " + dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }
    // public static void main(String[] args) {
    //     int n = 1;
    //     towerOfHanoi(n, "S", "H", "D");

    // }

    // public static void printReverse(String str, int idx) {

    //     if(idx == 0) {
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }

    //     System.out.print(str.charAt(idx));
    //     printReverse(str, idx-1);

    // }

    // public static void main(String[] args) {
    //     String str = "abcd";
    //     printReverse(str, str.length()-1);
    // }

    public static boolean isSorted(int arr[], int idx) {

        if(idx == arr.length-1) {
            return true;
        }

        if(arr[idx] < arr[idx+1]) {
            return isSorted(arr, idx+1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int arr[] = {4,2,5,8,1};

        System.out.println(isSorted(arr, 0));
        
    }
}
