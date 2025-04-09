// //Insertion Sort (time complexity= O(n^2))
// //sorts the array from the beginning in parts
// import java.util.*;
// public class sorting {
//    static void swap(int[] arr, int i, int j){
//        int temp= arr[i];
//        arr[i]= arr[j];
//        arr [j]= temp;
//    }
//    static void insertionSort(int[] arr){
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<=i; j++){
//                if (arr[j]>arr[i]){
//                    swap(arr, i, j);
//                }
//            }
//        }
//    }
//    static void output (int[] arr){
//        for (int i=0; i<arr.length ; i++){
//            if (i==arr.length-1) System.out.println(arr[i]);vc
//            else System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc= new Scanner (System.in);
//        int N= sc.nextInt();
//        int[] arr = new int[N];
//        for (int i=0; i<N; i++){
//            arr[i] = sc.nextInt();
//            sc.close();
//        }
//        insertionSort(arr);
//        output(arr);
//    }
// }


//Bubble sort (time complexity= O(n^2))
//swaps the adjacent two elements and pushes the
//larger one to the end of an array
import java.util.*;
public class sorting{
    static void swap(int[] arr, int i, int j){
        int temp= arr[j];
        arr[j]= arr[i];
        arr [i]= temp;
    }
    static void BubbleSort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    static void output (int[] arr){
        for (int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int N= sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            sc.close();
        }
        BubbleSort(arr);
        output(arr);
    }
}



// //Selection Sort (time complexity= O(n^2))
// //compares the elements with the less index and replaces
// //the smaller one to the one which has less index
// import java.util.*;
// public class sorting{
//    static void swap(int[] arr, int i, int j){
//        int temp= arr[j];
//        arr[j]= arr[i];
//        arr [i]= temp;
//    }
//    static void SelectionSort(int[] arr){
//        for (int i=0; i<arr.length-1; i++){
//            for (int j=i+1; j<arr.length; j++){
//                int temp= i;
//                if (arr[j]<arr[i]){
//                    swap(arr, i, j);
//                }
//            }
//        }
//    }
//    static void output (int[] arr){
//        for (int i=0; i<arr.length ; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc= new Scanner (System.in);
//        int N= sc.nextInt();
//        int[] arr = new int[N];
//        for (int i=0; i<N; i++){
//            arr[i] = sc.nextInt();
//            sc.close();
//        }
//        SelectionSort(arr);
//        output(arr);
//    }
// }