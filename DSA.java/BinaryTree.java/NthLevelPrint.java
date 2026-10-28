public class NthLevelPrint {
    public static void nthLevel(Node root, int level, int k){ // O(n)
        if(root == null) return;
        if(level == k) System.out.print(root.val + " ");
        nthLevel(root.left, level+1, k);
        nthLevel(root.right, level+1, k);
    }
    
    public static void main(String[] args) {
        //      1
        //     / \
        //    2   3
        //   / \   \
        //  0   5   7

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
        nthLevel(root, 0, 2);
    }
}
