public class LCA_II {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode LowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(find(root,p)==false||find(root,q)==false){
            return null;
        }
        return LCA(root,p,q);
    }
    public boolean find(TreeNode root, TreeNode p){
        if(root==null){
            return false;
        }
        if(root==p){
            return true;
        }
        return find(root.left,p)|| find(root.right,p);
    }
    public TreeNode LCA(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return null;
        }
        if(root.left==p || root.right==q){
            return root;
        }
        TreeNode left=LCA(root.left,p,q);
        TreeNode right=LCA(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        else if(left==null){
            return right;
        }
        else{
            return left;
        }
    }
}
