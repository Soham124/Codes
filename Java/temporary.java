// Fibonacci series using recursion
public class temporary {
    static int func(int count){
        if (count <= 0) {
            return 0;
        } else if (count == 1) {
            return 1;
        }
        int n = func(count-1) + func(count-2);
        return n;
    }
    public static void main(String[] args) {
        System.out.println(func(7));
    }
}
