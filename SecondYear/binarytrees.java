package SecondYear;




//Mirror image of Binary Tree
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class binarytrees {
    // Function to check if two trees are mirror images
    static boolean areMirror(Node a, Node b) {
        // Base cases
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        // Check recursively:
        // 1. The data should be the same
        // 2. Left subtree of 'a' is mirror of right subtree of 'b' and vice versa
        return (a.data == b.data) && areMirror(a.left, b.right) && areMirror(a.right, b.left);
    }
    public static void main(String[] args) {
        // Create first tree
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);
        // Create second tree (mirror of first)
        Node b = new Node(1);
        b.left = new Node(3);
        b.right = new Node(2);
        b.right.left = new Node(5);
        b.right.right = new Node(4);
        if (areMirror(a, b)) System.out.println("The two trees are mirror images of each other.");
        else System.out.println("The two trees are NOT mirror images of each other.");
    }
}




// //No. of Nodes:
// class Node {
//     int data;
//     Node left, right;
//     Node(int value) {
//         data = value;
//         left = right = null;
//     }
// }
// public class binarytrees {
//     Node root;
//     // Function to count nodes in the binary tree
//     int countNodes(Node node) {
//         if (node == null)
//             return 0;
//         return 1 + countNodes(node.left) + countNodes(node.right);
//     }
//     public static void main(String[] args) {
//         test tree = new test();
//         tree.root = new Node(1);
//         tree.root.left = new Node(2);
//         tree.root.right = new Node(3);
//         tree.root.left.left = new Node(4);
//         tree.root.left.right = new Node(5);
//         System.out.println("Total number of nodes: " + tree.countNodes(tree.root));
//     }
// }
