package FirstYear;
import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int N=sc.nextInt();

        // Syntax= datatype[] variablename = new datatype[size];

        int[] myArray = {1, 2, 3, 4, 5};
        
        int[] Arr = new int[N];
        for (int i=0; i<N; i++){
            Arr[i] = sc.nextInt();
            sc.close();
        }

        for (int i=0; i<N; i++){
            System.out.print(Arr[i]+ " ");
            System.out.print(myArray[i]+ " ");
        }
    }
}
