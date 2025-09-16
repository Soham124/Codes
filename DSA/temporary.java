package DSA;

public class temporary {
    public static void main(String[] args) {
        int [] nums = {11,7,15,2};
        int target = 9;

        int num1 = 0;
        int num2 = 0;
        boolean toggle = false;

        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];
            System.out.println("This is num1: "+ num1);
            for (int j = 0; j < nums.length; j++) {
                if(num1+nums[j] == target){
                    num2 = nums[j];
                    System.out.println("This is num2: "+ num2);
                }
            }
            if(toggle) break;
        }
        System.out.println(num1+" "+ num2);
    
    }
}
