public class DoubleThreadBT {
    static class Node {
        int val;
        Node left, right;
        boolean leftThread, rightThread; // true = thread (pred/succ), false = actual child

        Node(int val) {
            this.val = val;
            this.left = this.right = null;
            this.leftThread = this.rightThread = true; // shuru mein dono thread (null ki taraf)
        }
    }

    Node root;

    void insert(int val) {
        Node newNode = new Node(val);

        if (root == null) {
            root = newNode;
            return;
        }

        Node curr = root;
        Node parent = null;
        boolean goLeft = false;

        while (true) {
            parent = curr;
            if (val < curr.val) {
                goLeft = true;
                if (curr.leftThread) break;   // left thread hai -> yahi attach hoga
                curr = curr.left;
            } else {
                goLeft = false;
                if (curr.rightThread) break;  // right thread hai -> yahi attach hoga
                curr = curr.right;
            }
        }

        if (goLeft) {
            // newNode parent ke left mein lagega
            newNode.left = parent.left;      // parent ka purana predecessor thread copy
            newNode.leftThread = parent.leftThread;
            newNode.right = parent;          // successor = parent
            newNode.rightThread = true;

            parent.left = newNode;
            parent.leftThread = false;       // ab parent ka actual child hai
        } else {
            // newNode parent ke right mein lagega
            newNode.right = parent.right;    // parent ka purana successor thread copy
            newNode.rightThread = parent.rightThread;
            newNode.left = parent;           // predecessor = parent
            newNode.leftThread = true;

            parent.right = newNode;
            parent.rightThread = false;      // ab parent ka actual child hai
        }
    }

    Node leftMost(Node node) {
        if (node == null) return null;
        while (!node.leftThread) node = node.left;
        return node;
    }

    Node rightMost(Node node) {
        if (node == null) return null;
        while (!node.rightThread) node = node.right;
        return node;
    }

    // Inorder (left -> root -> right) using threads
    void inOrderTraversal() {
        Node curr = leftMost(root);
        while (curr != null) {
            System.out.print(curr.val + " ");
            if (curr.rightThread) curr = curr.right;
            else curr = leftMost(curr.right);
        }
        System.out.println();
    }

    // Reverse inorder (right -> root -> left) using threads
    void reverseInOrderTraversal() {
        Node curr = rightMost(root);
        while (curr != null) {
            System.out.print(curr.val + " ");
            if (curr.leftThread) curr = curr.left;
            else curr = rightMost(curr.left);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleThreadBT tree = new DoubleThreadBT();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values) tree.insert(v);

        System.out.print("Inorder Traversal: ");
        tree.inOrderTraversal();

        System.out.print("Reverse Inorder: ");
        tree.reverseInOrderTraversal();
    }
}