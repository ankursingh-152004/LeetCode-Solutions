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
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null)
            return root;
        Queue<TreeNode> q = new LinkedList<>();
        boolean l_to_r = false;
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            ArrayList<TreeNode> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                if (l_to_r) {
                    list.add(temp);
                }
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            if(l_to_r){
                int i=0;
                int j=list.size()-1;
                while(i<j){
                    int t = list.get(i).val;
                    list.get(i).val = list.get(j).val;
                    list.get(j).val = t;

                    i++;
                    j--;

                }
            }

            l_to_r = !l_to_r;
        }
        return root;
    }
}