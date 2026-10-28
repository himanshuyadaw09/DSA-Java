class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }    
}

public class Basic {
    public static int min(Node root){
        return (root == null)? Integer.MAX_VALUE : Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
    public static int max(Node root){
        return (root == null)? Integer.MIN_VALUE : Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    public static int productNonZero(Node root){
        if(root == null || root.val == 0) return 1;
        return root.val * productNonZero(root.left) *productNonZero(root.right);

    }
    public static int sum(Node root){
        return (root == null)? 0 : (root.val + sum(root.left) + sum(root.right));
    }
    public static int product(Node root){
        return (root == null)? 1 : (root.val * product(root.left) * product(root.right));
    }
    public static int size(Node root){
        return (root == null)? 0 : 1 + size(root.left) + size(root.right);
    }
    // pre-order traversal
    public static void displayPre(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        displayPre(root.left); // left ki sari value print
        displayPre(root.right); // right ki sari value print
    }
    // in-order traversal
    public static void displayIn(Node root){
        if(root==null) return;        
        displayIn(root.left); // left ki sari value print
        System.out.print(root.val+" ");
        displayIn(root.right); // right ki sari value print
    }
    // post-order traversal
    public static void displayPost(Node root){
        if(root==null) return;
        displayPost(root.left); // left ki sari value print
        displayPost(root.right); // right ki sari value print
        System.out.print(root.val+" ");
    }
    public static void main(String[] args){
        //      1
        //     / \
        //    2   3
        //   / \   \
        //  4   5   7

        Node root = new Node(1);        
        Node a = new Node(2);        
        Node b = new Node(3);        
        Node c = new Node(0);
        Node d = new Node(5);        
        Node f = new Node(7);
        Node e = new Node(0);
        root.left = a; 
        root.right = b;
        a.left = c; 
        a.right = d;
        b.right = f;
        f.left = e;
        System.out.print("Pre-Order: ");
        displayPre(root);
        System.out.println();
        System.out.print("In-Order: ");
        displayIn(root);
        System.out.println();
        System.out.print("Post-Order: ");
        displayPost(root);
        System.out.println();
        System.out.print("Size of Tree: " + size(root));
        System.out.println("\nSum: " + sum(root));
        System.out.println("Product: " + product(root));
        System.out.println("Product of Non-zero value: " + productNonZero(root));
        System.out.println("Maximum value: " + max(root));
        System.out.println("Minimum value: " + min(root));
    }
    
}
