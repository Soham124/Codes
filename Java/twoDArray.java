//        int min = Integer.MIN_VALUE;
//        int max= Integer.MAX_VALUE;
//        System.out.println(min);
//        System.out.println(max);
import java.util.*;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [] [] A = new int [r] [c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                A [i][j]= sc.nextInt();
                sc.close();
            }
        }
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}