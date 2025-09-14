package FirstYear;
public class twoPointers {
    public static void main(String[] args) {
        int A [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 7;
        int start = 0;
        int end = A.length-1;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[start]-A[end]==k || A[end]-A[start]==k) {
                num1 = A[start];
                num2 = A[end];
            }else if (num1!=0 && num2!=0) {
                break;
            }else{
                if(start<=end){
                    start++;
                    end--;
                }
            }
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}
