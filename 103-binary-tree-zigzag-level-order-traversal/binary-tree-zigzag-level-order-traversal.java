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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        Stack<TreeNode> s=new Stack<>();
        q.add(root);
        boolean left_to_right=true;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> res=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                if(left_to_right){
                    res.add(temp.val);
                }else{
                    s.push(temp);
                }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);

            }
            if(left_to_right==false){
                while(!s.isEmpty()){
                    res.add(s.pop().val);
                }
            }
            ans.add(res);
                left_to_right=!left_to_right;
        }
        return ans;
    }
}