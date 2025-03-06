import java.util.*;
public class pattern {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int N= sc.nextInt();
        for (int i=1; i<=N; i++){
            for (int j=N; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
//1 ke liye
//for (int j=N; j>=i; j--){
//                System.out.print("*");
//            }

//2 ke liye
//for (int j=N; j>=i; j--){
//        System.out.print("*");
//            }

//3 ke liye
//for (int j=2; j<=i; j++){
//        System.out.print("*");
//            }

//4 ke liye
//for (int j=2; j<=i; j++){
//        System.out.print("*");
//            }