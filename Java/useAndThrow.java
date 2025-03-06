public class useAndThrow {
    public static void main(String[] args) {
        int arr[] = {27,18,20};
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i]&arr[j])>=max) {
                    max = arr[i]&arr[j];
                }
            }
        }
        System.out.println(max);
    }
}