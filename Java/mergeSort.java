
import java.util.Arrays;

public class mergeSort {

    static int[] merge(int[] left, int[] right) {
        int[] newArr = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i<left.length && j<right.length) {
            if (left[i] <= right[j]) {
                newArr[k]=left[i];
                i++;
            }else{
                newArr[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            newArr[k] = left[i];
            k++;
            i++;
        }
        while (j<right.length){
            newArr[k] = right[j];
            k++;
            j++;
        }
        return newArr;
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static void main(String[] args) {
        int arr[] = {12,3,12,1,42,12,412,4};
        arr = mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
