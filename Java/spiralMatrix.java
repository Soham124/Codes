public class spiralMatrix{
    public static void main(String[] args) {
        int [][] matrix={{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int n= matrix.length;
        int m= matrix[0].length;
        int loop;
        if(n%2==0){
            loop= n/2;
        } else{ loop=(n/2)+1;}
        int top=0;
        int bottom= n-1;
        int left= 0;
        int right= m-1;

        //printing:
        for (int j = 0; j < loop; j++) {
            for(int i= left; i<=right; i++){
                System.out.print(matrix[top][i]+" ");
            }
            System.out.println();
            top++;
            for(int i= top; i<=bottom; i++){
                System.out.print(matrix[i][right]+" ");
            }
            System.out.println();
            right--;
            for(int i= right; i>=left; i--){
                System.out.print(matrix[bottom][i]+" ");
            }
            System.out.println();
            bottom--;
            for(int i= bottom; i>=top; i--){
                System.out.print(matrix[i][left]+" ");
            }
            System.out.println();
            left++;
        }
    }
}