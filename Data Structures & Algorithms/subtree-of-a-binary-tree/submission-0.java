/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  

    public boolean isMatch(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        if(p.val != q.val) return false;

        return isMatch(p.left,q.left) && isMatch(p.right,q.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode sub) {
        if(root==null && sub==null) return true;
        if(root==null || sub==null) return false;

        if(isMatch(root,sub)) return true;

        return isSubtree(root.left,sub) || isSubtree(root.right,sub);
    }
}
