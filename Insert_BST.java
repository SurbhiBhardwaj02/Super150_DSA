public class Insert_BST {
    private class TreeNode {
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
  class Solution{
     public TreeNode insertIntoBst(TreeNode root,int val){
      if(root==null){
       return new TreeNode(val);
      }
      if(root.val<val){
       root.right=insertIntoBst(root.right,val);
      }
      else{
       root.left=insertIntoBst(root.left,val);
      }
      return root;
     }
  }
}
