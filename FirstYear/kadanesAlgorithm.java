//this program calculates the maximum sum of all the possible sub arrays in O(N) time complexity
package FirstYear;
public class kadanesAlgorithm {
    public static void main(String[] args) {
        int []A = {3,-4,5,4,-1,7,-8};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < A.length; i++) {
            currentSum += A[i];
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum<0){
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
