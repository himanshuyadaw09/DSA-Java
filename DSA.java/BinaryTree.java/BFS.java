import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

class Pair {
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}

public class BFS {
    // public static ArrayList<ArrayList<Integer>> levelOrder(Node root){
    //     ArrayList<Integer> req = new ArrayList<>();
    //     ArrayList<Integer> ans = new ArrayList<>();
        
    // }
    public static void withLevel(Node root){
        Queue<Pair> p = new LinkedList<>();
        p.add(new Pair(root, 0));
        int currLevel = 0;
        while(p.size() > 0){
            Pair front = p.remove();
            if(front.level != currLevel){
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left != null) p.add(new Pair(front.node.left, front.level+1));
            if(front.node.right != null) p.add(new Pair(front.node.right, front.level+1));
        }System.out.println();
    }
    public static void levels(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }System.out.println();
    }
    public static void main(String[] args) {
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
        levels(root);
        withLevel(root);
    }
}
