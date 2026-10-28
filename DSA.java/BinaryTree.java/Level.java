public class Level {
    public static int level(Node root){
        return (root == null)? 0 : (1 + Math.max(level(root.left), level(root.right)));
    }
    public static void main(String[] args){
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
        root.left = a; root.right = b;
        a.left = c; a.right = d;
        b.right = f;
        System.out.println("Level Of Binary Tree: " + level(root));
    }
    
}
