import java.util.Scanner;

public class rotatedArrayPivot {
    public static int pivot(int[]arr){
        int pivot=0;
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int mid= start+(end-start)/2;
			if (arr[mid]<arr[start]) {
				if(arr[mid]<arr[mid-1]){
					return mid;
				}
				pivot=arr[mid];
				end=mid-1;
			}else if (arr[mid]<arr[start]) {
				start= mid+1;
			}
		}
        return pivot;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
		int [] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int target= sc.nextInt();

        //Finding Pivot:
        int rotated= pivot(arr);
		

        //Binary Search:
        int start;
        int end;
        if(target>=arr[N-rotated]){
            start=N-rotated;
            end=arr.length-1;
        }else{
            start=0;
            end=N-rotated-1;
        }
		
		int ans=-1;
		while(start<=end){
			int mid= start+(end-start)/2;
			if (target==arr[mid]) {
				ans=mid;
				break;
			}else if (target<arr[mid]) {
				ans= mid;
				end=mid-1;
			}else if (target>arr[mid]){
				start=mid+1;
			}
			sc.close();
		}
		System.out.println(ans);

    }
}
