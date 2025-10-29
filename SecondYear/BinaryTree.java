package SecondYear;
import java.util.*;

public class BinaryTree {

    // Node class represents each node in the binary tree
    private static class Node {
        int value;
        Node left;
        Node right;

        // Constructor to create a new node
        public Node(int value) {
            this.value = value;
        }
    }

    private Node root; // Root node of the binary tree

    // Method to build the binary tree from user input (preorder: root, left, right)
    public void buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root value: ");
        root = buildTreeHelper(sc);
    }

    // Helper method for building the tree recursively
    private Node buildTreeHelper(Scanner sc) {
        int val = sc.nextInt();
        if (val == -1) { // Use -1 as a marker for null nodes
            return null;
        }
        Node node = new Node(val);
        System.out.print("Enter left child of " + val + " (-1 for null): ");
        node.left = buildTreeHelper(sc);
        System.out.print("Enter right child of " + val + " (-1 for null): ");
        node.right = buildTreeHelper(sc);
        return node;
    }

    // Preorder traversal: root, left, right
    public void preorder() {
        System.out.print("Preorder: ");
        preorderHelper(root);
        System.out.println();
    }

    private void preorderHelper(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preorderHelper(node.left);
        preorderHelper(node.right);
    }

    // Inorder traversal: left, root, right
    public void inorder() {
        System.out.print("Inorder: ");
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(Node node) {
        if (node == null) return;
        inorderHelper(node.left);
        System.out.print(node.value + " ");
        inorderHelper(node.right);
    }

    // Postorder traversal: left, right, root
    public void postorder() {
        System.out.print("Postorder: ");
        postorderHelper(root);
        System.out.println();
    }

    private void postorderHelper(Node node) {
        if (node == null) return;
        postorderHelper(node.left);
        postorderHelper(node.right);
        System.out.print(node.value + " ");
    }

    // Main method for testing
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.buildTree(); // Build tree from user input

        tree.preorder();  // Print preorder traversal
        tree.inorder();   // Print inorder traversal
        tree.postorder(); // Print postorder traversal
    }
}