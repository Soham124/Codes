//merging two sorted arrays
public class sortedMerge {
    public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0, k = 0;
        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of arr1, if any
        while (i < n1) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        // Copy remaining elements of arr2, if any
        while (j < n2) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr3 = new int[arr1.length + arr2.length];

        mergeArrays(arr1, arr2, arr3);

        for (int value : arr3) {
            System.out.print(value + " ");
        }
    }
}
