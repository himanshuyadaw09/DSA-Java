class Pair {
    int max;
    int min;
    Pair(int max, int min){
        this.max = max;
        this.min = min;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class ValidBST {
    static boolean flag;
    static Pair pairMaxMin(TreeNode root){
        if(root == null) return new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);
        Pair lst = pairMaxMin(root.left);
        Pair rst = pairMaxMin(root.right);
        if(lst.max >= root.val || rst.min <= root.val) flag = false;
        int max = Math.max(root.val, Math.max(lst.max, rst.max));
        int min = Math.min(root.val, Math.min(lst.min, rst.min));
        return new Pair(max, min);
    }
    static boolean isBST(TreeNode root){
        flag = true;
        pairMaxMin(root);
        return flag;
    }
    static void inorderTraversal(TreeNode root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val+ " ");
        inorderTraversal(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
        inorderTraversal(root);
        System.out.println();
        System.out.println("Given BST is Valid?: " + isBST(root));
    }
}