class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }    
}

public class Basic {
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
        Node c = new Node(4);
        Node d = new Node(5);        
        Node f = new Node(7);
        root.left = a; 
        root.right = b;
        a.left = c; 
        a.right = d;
        b.right = f;
        System.out.print("Pre-Order: ");
        displayPre(root);
        System.out.println();
        System.out.print("In-Order: ");
        displayIn(root);
        System.out.println();
        System.out.print("Post-Order: ");
        displayPost(root);
        System.out.println();
    }
    
}
