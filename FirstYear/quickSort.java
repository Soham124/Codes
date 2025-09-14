package FirstYear;

import java.util.Arrays;

public class quickSort {
    static void quickSort(int [] nums, int low, int high){
        if(low >= high) return;
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s<=e){
            //if sprted it wont sort
            while (nums[s] < pivot) s++;
            while (nums[e] > pivot) e--;
            if (s<=e){
                int temp = nums[s];
                nums[s] = nums [e];
                nums [e] = temp;
                s++;
                e--;
            }
        }
        //pivot is at correct index now sort the other two halves by recursion
        quickSort(nums, low, e);
        quickSort(nums, s, high);

    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
