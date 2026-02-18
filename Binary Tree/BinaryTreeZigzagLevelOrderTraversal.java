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
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Deque<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        boolean oddLevel= true;
        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> l = new LinkedList<>();
            for(int i =0;i<size;i++){
                if(oddLevel){
                    TreeNode temp = qu.pollFirst();
                    l.add(temp.val);
                    if(temp.left!=null) qu.addLast(temp.left);
                    if(temp.right!=null) qu.addLast(temp.right);
                }
                else {
                    TreeNode temp = qu.pollLast();
                    l.add(temp.val);
                    if(temp.right!=null) qu.addFirst(temp.right);
                    if(temp.left!=null) qu.addFirst(temp.left);
                }
            }
            oddLevel=!oddLevel;
            ans.add(l);
        }
        return ans;
    }
}