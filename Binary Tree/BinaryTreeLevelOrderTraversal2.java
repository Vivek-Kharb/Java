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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> l = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = qu.poll();
                l.add(temp.val);
                if(temp.left!=null) qu.add(temp.left);
                if(temp.right!=null) qu.add(temp.right);
            }
            ans.add(0,l);
        }

        return ans;


    }
}