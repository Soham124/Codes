public class matrixMultiplacation {
    public static void main(String[] args) {
        int m1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int m2[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int r[][] = new int[m1.length][m2[0].length];
        int sum=0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    sum= sum+m1[i][k]*m2[k][j];
                }
                r[i][j]= sum;
                sum=0;
            }
        }
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
    }
}