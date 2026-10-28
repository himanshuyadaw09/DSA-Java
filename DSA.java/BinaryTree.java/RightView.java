import java.util.ArrayList;
public class RightView {
    public static int levelCount(Node root){
        return (root == null) ? 0: (1 + Math.max(levelCount(root.left), levelCount(root.right)));
    }
    public static void view(Node root, int level, ArrayList<Integer> ans){
        if(root == null) return;
        if(level >= ans.size()) ans.add(root.val);
        else ans.set(level, root.val);
        view(root.left, level+1, ans);
        view(root.right, level+1, ans);
    }
    public static ArrayList<Integer> rightView(Node root){
       ArrayList<Integer> ans = new ArrayList<>();
       view(root,0,ans);
       return ans;  
    }
    public static void main(String[] args) {
        //      1
        //     / \
        //    2   3
        //   / \   \
        //  0   5   7
        //          /
        //         0

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
     
        System.out.println(rightView(root));
    }
}