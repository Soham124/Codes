package FirstYear;
import java.util.*;

public class rotateMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] Arr= new int [rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Arr[i][j] = sc.nextInt();
                sc.close();
            }
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = cols-1; j >= 0; j--) {
                System.out.print(Arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}