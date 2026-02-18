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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root==null) return ans ;
        qu.add(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> l = new ArrayList<>(size);
            for(int i =0;i<size;i++){
                TreeNode temp = qu.remove();
                l.add(temp.val);
                if(temp.left!=null) qu.add(temp.left);
                if(temp.right!=null) qu.add(temp.right);
            }
            ans.add(l);
        }
        return ans;
    }
}