//This code fills an empty array with the given value from the 
//given starting index to the enging index of an array

import java.util.*;

public class indexValue {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Arr[] = new int[6];
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the number of quiries: ");
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            System.out.println("Enter the starting index: ");
            int s = sc.nextInt();
            System.out.println("Enter the ending index: ");
            int e = sc.nextInt();
            System.out.println("Enter the value: ");
            int value = sc.nextInt();

            for (int i = s; i < e + 1; i++) {
                Arr[i] += value;
            }

            for (int i = 0; i < Arr.length; i++) {
                System.out.print(Arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}