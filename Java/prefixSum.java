public class prefixSum {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6,7};
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i]+A[i-1];
        }
        
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print(A[6]-A[3]);

    }
}
