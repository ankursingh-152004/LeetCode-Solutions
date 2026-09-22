/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1=new ArrayList<>();
        ArrayList<TreeNode> path2=new ArrayList<>();

        if(findPath(root,p,path1)==false ||findPath(root,q,path2)==false) return null;
        for(int i=0;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                return path1.get(i-1);
            }
        }
         return path1.get(Math.min(path1.size(), path2.size()) - 1);
    }
    private static boolean findPath(TreeNode node,TreeNode val,ArrayList<TreeNode> p){
        if(node==null){
            return false;
        }
        p.add(node);
        if(node==val){
            return true;
        }
        if(findPath(node.left,val,p)||findPath(node.right,val,p)){
            return true;
        }
        p.remove(p.size()-1);
        return false;
    }
}