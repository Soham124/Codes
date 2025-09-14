package FirstYear;

public class towergame {
    static void TOH(int N, int A, int C, int B){
        if(N==0){
            return;
        }
        TOH(N-1, A, B, C);
        System.out.println(A+"to"+C);
        TOH(N-1, B, C, A);
    }
    public static void main(String[] args) {
        // 3 Towers
        TOH(3, 1, 2, 3);
    }
}
