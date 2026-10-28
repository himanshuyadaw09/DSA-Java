import java.util.Scanner;
class Node {
    int val;
    Node left;
    Node right;
    boolean rightThread;
    Node(int val){
        this.val = val;
        this.rightThread = true;
    }
}
public class Basic {
    // static Node insertNode(Node root, int val){
    //     Node newNode = new Node(val);
    //     if(root == null) return newNode;
    //     Node curr = root;
    //     while(true){
    //         if(val < curr.val){
    //             curr.left = newNode;
    //         }
    //     }
    //     return newNode;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Nodes: ");
        int n = sc.nextInt();
        int[] values = new int[n];
        for(int i = 0; i < n; i++){
            values[i] = sc.nextInt();
        }
        Node root = new Node(values[0]);
        for(int i = 1; i < n; i++){
            root = insertNode(root, values[i]);
        }
        
    }
    
}
