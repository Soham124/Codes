public class recursion {
    static int pow(int a,int b){
       if(b==0){
        return 1;
       }
       return a * pow(a, b-1);
    }
    public static void main(String[] args) {
        int n = pow(2,3);
        System.out.println(n);
    }
}