//writes the fibonacci sequence till N
//Eg:
//0 1 2 3 4 5 6 7 ...
//0 1 1 2 3 5 8 13 ...
import java.util.Scanner;

public class fibonacci {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sc.nextInt();//5
        int a=-1,b=1,c=0;
        for(int i=0;i<=n;i++)//1<=5 2<=5 3<=5 4<=5  5<=5  6<=5
        {
            c=a+b;//-1+1=>0  1+0=>1  0+1=1  1+1=2  1+2=3
             //0  1  1 2  3
            a=b;//1 0  1  1  2
            b=c;//0 1  1  2  3
            sc.close();
        }
        System.out.println(c);
    }
}