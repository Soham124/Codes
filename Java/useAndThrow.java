import java.util.*;

class Queue {

    Stack<Integer> S1 = new Stack<>();
    Stack<Integer> S2 = new Stack<>();

    void add(int x) {
        S1.add(x);
    }

    void remove() {
        while (!S1.isEmpty()) {
            S2.push(S1.pop());
        }

        if (!S2.isEmpty()) {
            S2.pop();
        }
        while (!S2.isEmpty()) {
            S1.push(S2.pop());
        }
    }

    void print() {
        while (!S1.isEmpty()) {
            System.out.println(S1.pop());
        }
    }

}
