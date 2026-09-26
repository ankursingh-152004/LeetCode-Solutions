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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        addElement(root1,l1);
        addElement(root2,l1);
        Collections.sort(l1);
        return l1;
    }
    public static void addElement(TreeNode root,List<Integer> l){
        if(root==null) return;
        l.add(root.val);
        addElement(root.left,l);
        addElement(root.right,l);
    }
}