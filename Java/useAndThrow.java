public class useAndThrow {
    public static void divide(int arr[], int si, int ei){
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        
    }
    public static void main(String[] args) {
        int arr [] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
    }
}