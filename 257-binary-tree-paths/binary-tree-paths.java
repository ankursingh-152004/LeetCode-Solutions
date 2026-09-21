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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> str=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        if(root==null) return str;
        else{
            BTP(root,"",str);
        }
    return str;
    }
    private static void BTP(TreeNode root,String path,List<String> str){
        if(root.left==null && root.right==null) str.add(path+root.val);
        if(root.left!=null) BTP(root.left,path+root.val+"->",str);
        if(root.right!=null) BTP(root.right,path+root.val+"->",str);
    }
}