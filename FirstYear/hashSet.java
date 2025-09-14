package FirstYear;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N= sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
            sc.close();
        }
        System.out.println(set);
        // System.out.println(set.size());
    }
}
