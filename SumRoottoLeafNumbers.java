
class TreeNode {
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
public class SumRoottoLeafNumbers
{
    public int sumNumbers(TreeNode root) {
        return getNum(root,0);
    }
    public int getNum(TreeNode root,int n){
        if(root==null){
            return 0;
        }
        if(root.left==null&& root.right==null){
            return n*10 + root.val;
        }
        int ln= getNum(root.left,(n*10)+root.val);
        int rn= getNum(root.right,(n*10)+root.val);
        return ln+rn;
    }
}
