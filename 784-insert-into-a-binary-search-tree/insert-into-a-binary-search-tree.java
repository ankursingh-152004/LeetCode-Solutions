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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode=new TreeNode(val);
        TreeNode temp=root;
        TreeNode parent=null;
        while(temp!=null){
            parent=temp;
            if(temp.val>val){
                temp=temp.left;
            }else{
                temp=temp.right;
            }
        }
        if(parent==null) return newNode;
        else if(parent.val>val){
            parent.left=newNode;
        }else{
            parent.right=newNode;
        }
        return root;
    }
}