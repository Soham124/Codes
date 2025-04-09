
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

        
    }
}