//Binary search only works on sorted arrays
package FirstYear;
import java.util.*;

public class binarySearch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {3,6,9,11,14,19,20,23,25};
		int target= sc.nextInt();
		int start=0;
		int end=arr.length-1;
		int ans=-1; //not found
		while(start<=end){
			int mid= start+(end-start)/2;
			if (target == arr[mid]) {
				ans = mid;  // Return the index when target is found
				break;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
				sc.close();
			}
		}
		System.out.println(ans);
	}
}