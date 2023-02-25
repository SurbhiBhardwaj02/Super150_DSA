public class DistributeCoinsinBTree {
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
    class Solution {
        int move=0;
        public int distributeCoins(TreeNode root) {
            if(root==null){
                return -1;
            }
            int left=distributeCoins(root.left);
            int right=distributeCoins(root.right);
            move+= Math.abs(left)+Math.abs(right);
            return left+right+root.val-1;
        }
    }
}
