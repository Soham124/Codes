package FirstYear;
import java.util.*;

public class unique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int count = 0;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(i).equals(A.get(j))) {
                    count++;
                }
            }
            if (count == 1) {
                B.add(A.get(i));
                sc.close();
            }
        }
        System.out.println(B);
    }
}
