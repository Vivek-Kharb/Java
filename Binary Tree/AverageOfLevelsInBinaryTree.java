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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int quSize= qu.size();
            double quSum=0;
            for(int i =0;i<quSize;i++){
                TreeNode temp = qu.poll();
                quSum=quSum+temp.val;
                if(temp.left!=null) qu.add(temp.left);
                if(temp.right!=null) qu.add(temp.right);
            }
            ans.add(quSum/quSize);
        }
        return ans;


    }
}