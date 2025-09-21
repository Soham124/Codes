package DSA;
import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        System.out.println(map);
        System.out.println(map.size()); //size of the hashmap(no of pairs)
        if(map.containsKey(4)){
            System.out.println(map.get("Green")); //prints value of key Green if it exists
        }


    }
}
