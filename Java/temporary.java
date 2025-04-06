
public class temporary {
    static int func(int[] operations){
        int count = 0;
        for(int i = 0; i < operations.length; i++){
            if (operations[i]==6 || operations[i]==7){
                count++;
            }
        }
        
        if(count!=operations.length-count){
            return count-operations.length-count;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 7, 6, 7};
        System.out.println(func(arr));
    }
}
