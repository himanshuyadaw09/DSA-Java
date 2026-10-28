public class SingleThreadBT {
    static class Node {
        int val;
        Node left, right;
        boolean rightThread; // true matlab right pointer inorder successor hai, actual child nahi

        Node(int val) {
            this.val = val;
            this.left = this.right = null;
            this.rightThread = false;
        }
    }

    Node root;

    // insert
    void insert(int val) {
        Node newNode = new Node(val);

        if (root == null) {
            root = newNode;
            return;
        }

        Node curr = root;
        Node parent = null;
        boolean goLeft = false; // last move left tha ya right, yaad rakhne ke liye

        while (curr != null) {
            parent = curr;

            if (val < curr.val) {
                goLeft = true;
                curr = curr.left; // agar null hai to loop khud hi ruk jayega
            } else {
                goLeft = false;
                if (curr.rightThread) {
                    curr = null; // thread hai, actual child nahi -> yahin ruko
                } else {
                    curr = curr.right;
                }
            }
        }

        // ab parent ke sahi side pe newNode attach karo
        if (goLeft) {
            newNode.right = parent;       // naya node ka thread parent ki taraf
            newNode.rightThread = true;
            parent.left = newNode;
        } else {
            newNode.right = parent.right; // parent ka purana successor copy karo
            newNode.rightThread = true;
            parent.right = newNode;       // ab parent ka right = actual child
            parent.rightThread = false;
        }
    }

    // sabse left wala node dhoondo (inorder ka starting point)
    Node leftMost(Node node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Inorder traversal threads use karke (bina stack/recursion ke)
    void inOrderTraversal() {
        Node curr = leftMost(root);
        while (curr != null) {
            System.out.print(curr.val + " ");
            if (curr.rightThread) {
                curr = curr.right;       // thread follow karo
            } else {
                curr = leftMost(curr.right); // right subtree ka leftmost
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingleThreadBT tree = new SingleThreadBT();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values) tree.insert(v);

        System.out.print("Inorder Traversal: ");
        tree.inOrderTraversal();
    }
}