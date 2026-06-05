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

    public int kthSmallest(TreeNode root, int k) {
        
        Queue<TreeNode> q = new LinkedList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        q.add(root);

        while(!q.isEmpty()){
            for(int i=0;i<q.size();i++){
                TreeNode curr = q.remove();
                pq.offer(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }

        for(int i=0;i<k-1;i++){
            pq.poll();
        }

        int ans = pq.poll();
        return ans;
   
    }
}
