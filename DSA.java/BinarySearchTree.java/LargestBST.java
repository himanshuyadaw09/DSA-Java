class Quad {
    int max;
    int min;
    int size;
    boolean isBST;
    Quad(int max, int min, int size, boolean isBST){
        this.max = max;
        this.min = min;
        this.size = size;
        this.isBST = isBST;
    }
}
public class LargestBST {
    static int maxSize;
    public static Quad largeBST(TreeNode root){
        if(root == null) return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
        Quad lst = largeBST(root.left);
        Quad rst = largeBST(root.right);
        int max = Math.max(root.val, Math.max(lst.max, rst.max));
        int min = Math.min(root.val, Math.min(lst.min, rst.min));
        int size = 1 + lst.size + rst.size;
        boolean isBST = (root.val > lst.max) && (root.val < rst.min) && lst.isBST && rst.isBST;
        if(isBST) maxSize = Math.max(size, maxSize);
        return new Quad(max, min, size, isBST);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(20);
        largeBST(root);
        System.out.println(maxSize);
        
    }
}
