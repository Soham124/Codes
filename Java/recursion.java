import java.util.*;

public class recursion {

    //Fibonacci Series by recursion
    // static int fibo(int n) {
    //     if(n<=1){
    //         return n;
    //     }
    //     return((fibo(n-1)+fibo(n-2)));
    // }

    //Binary Search by recursion
    // static int bin(int arr [], int target, int s, int e){
    //     int mid = s+ (e-s)/2;
    //     if (s>e){
    //         return -1;
    //     }else if(target>arr[mid]){
    //         return bin(arr, target, mid+1, e);
    //     }else if(target == arr[mid]){
    //         return mid;
    //     }else{
    //         return bin(arr, target, s, mid-1);
    //     }
    // }

    //Number printing from n to 1;
    // static void series(int n){
    //     if(n==0) return;
    //     series(n-1);
    //     System.out.print(n+" ");
    // }

    //Factorial
    // static int fact(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     return n * fact(n-1);
    // }

    //Sum of digits
    // static int sum(int n){
    //     if(n<10){
    //         return n;
    //     }
    //     return ((n%10)+sum(n/10));
    // }

    //Product of digits
    // static int product(int n){
    //     if(n<10){
    //         return n;
    //     }
    //     return (n%10) * product(n/10);
    // } 

    // Reverse a number
    // static int revHelper(int n, int rev) {
    //     if(n==0){
    //         return rev; // Base case: when the number is fully processed
    //     }
    //     rev = rev * 10 + n % 10; // Extract the last digit and Append the digit to the reversed number multiplied by 10
    //     return revHelper(n / 10, rev); //Repeat with the remaining number
    // }
    // static int rev(int n) {
    //     return revHelper(n, 0); // Start with an initial reversed value of 0
    // }

    //Check Palindrome or not
    // static boolean isPalindromeHelper(int n, int divisor) {
    //     if (n < 10) {
    //         return true; // Single-digit numbers are palindromes
    //     }
    //     int firstDigit = n / divisor; // Extract the first digit
    //     int lastDigit = n % 10;       // Extract the last digit
    //     if (firstDigit != lastDigit) {
    //         return false; // If first and last digits are not equal, it's not a palindrome
    //     }
    //     // Remove the first and last digits and continue
    //     n = (n % divisor) / 10;
    //     divisor /= 100; // Adjust divisor for the reduced number
    //     return isPalindromeHelper(n, divisor);
    // }
    
    // static boolean pal(int n) {
    //     int divisor = 1;
    //     while (n / divisor >= 10) {
    //         divisor *= 10; // Find the divisor to extract the first digit
    //     }
    //     return isPalindromeHelper(n, divisor);
    // }

    //Count Zeroes
    // static int zeroes(int n) {
    //     if (n < 10) {
    //         return (n == 0) ? 1 : 0; // Base case: Check if the last digit is 0
    //     }
    //     int lastDigit = n % 10;
    //     if (lastDigit == 0) {
    //         return 1 + zeroes(n / 10); // Add 1 if the last digit is 0
    //     }
    //     return zeroes(n / 10); // Otherwise, just recurse
    // }

    //Check if Array is Sorted or Not
    // static boolean  isSorted(int arr [], int i){
    //     if (arr.length == 0) {
    //         return true; // An empty array is considered sorted
    //     }
    //     if(i == arr.length-1){
    //         return true;
    //     }
    //     return arr[i]<=arr[i+1] && isSorted(arr, i+1);
    // }

    //Linear Searching in an Array
    // static int linearSearchHelper(int arr [], int target, int index){
    //     if (index == arr.length) return -1;
    //     if(arr[index] == target) return index;
    //     return linearSearchHelper(arr, target, index+1);
    // }
    // static int linearSearch(int arr [], int target){
    //     return linearSearchHelper(arr, target, 0);
    // }

    //Pattern by Recursion
    // static void pattern(int rows, int cols){
    //     if(rows==0){
    //         return;
    //     }
    //     if(cols<rows){
    //         System.out.print("*");
    //         pattern(rows, cols+1);
    //     }else{
    //         System.out.println();
    //         pattern(rows-1, 0);
    //     }
    // }

    //Bubble Sorting
    // static void bubbleSort(int arr [], int r, int c){
    //     if(r==0) return;
        
    //     if(c<r){
    //         if(arr[c]>arr[c+1]){
    //             int temp = arr[c];
    //             arr[c] = arr[c+1];
    //             arr[c+1]= temp;
    //         }
    //         bubbleSort(arr, r, c+1);
    //     }
    //     if(r==c) bubbleSort(arr, r-1, 0);
    // }

    //Selection Sorting
    static void selectionSort(int arr [], int r, int c, int max){
        if(r==0) return;
        if(c<r){
            if(arr[c]>arr[max]){
                selectionSort(arr, r, c+1, c);
            }else{
                selectionSort(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, r-1, 0, 0);
        }
    }

    public static void main(String[] args) {
        //Fibonacci
        // int n = fibo(5);

        //binary search
        // int [] arr = {4, 8, 16, 32, 64, 128};
        // int target = 64;
        // int e = arr.length-1;
        // int s = 0;
        // int n = bin(arr, target, s, e);

        //num printing
        // series(5);

        //factorial
        // int n = fact(5);
        // System.out.println(n);

        //Sum of digits of n
        // int n = sum(1432);
        // System.out.println(n);

        //Product of digits of n
        // int n = product(555);
        // System.out.println(n);

        //Reverse a number
        // int n = rev(1824);
        // System.out.println(n);

        //Palindrome
        // System.out.println(pal(14541));

        //Count Zeroes
        // System.out.println(zeroes(208020042));

        //Check if Array is Sorted or Not
        // int [] arr = {1, 2, 3, 8, 9};
        // System.out.println(isSorted(arr, 0));

        //Linear Search for a target in an Array
        // int [] arr = {3, 2, 1, 18, 9};
        // System.out.println(linearSearch(arr, 18));

        //Pattern by Recursion
        // pattern(4, 0);

        //Bubble Sorting
        // int [] arr = {1, 2, 5, 65, 64, 1, 24, 6, 6};
        // bubbleSort(arr, arr.length-1, 0);
        // System.out.println(Arrays.toString(arr));
        
        //Selection Sorting
        int [] arr = {1, 2, 5, 65, 64, 1, 24, 6, 6};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}