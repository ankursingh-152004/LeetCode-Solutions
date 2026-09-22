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
       static int max_dia;
    public int diameterOfBinaryTree(TreeNode root) {
        max_dia=0;
       height(root);
     return max_dia;
    }
    private static int height(TreeNode root){
        if(root==null){
            return 0;
        }
       int lc_height=height(root.left);
        int rc_height=height(root.right);
        max_dia=Math.max(max_dia,lc_height+rc_height);
        return 1+Math.max(lc_height,rc_height);
    }
}