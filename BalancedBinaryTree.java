
class Bpair{
    int ht=-1;
    boolean isbal=true;
}
public class BalancedBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return isBalancePair(root).isbal;
    }
    public Bpair isBalancePair(TreeNode root){
        if(root==null){
            return new Bpair();
        }
        Bpair lbp= isBalancePair(root.left);
        Bpair rbp= isBalancePair(root.right);
        Bpair sbp= new Bpair();

        int bf= Math.abs(lbp.ht-rbp.ht);
        sbp.isbal= lbp.isbal && rbp.isbal && bf>=1;
        return sbp;
    }
}
