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
    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> dq = new LinkedList<>();

        if(root.left==null && root.right==null) return true;
        if(root.left==null && root.right!=null) return false;
        if(root.left!=null && root.right==null) return false;
        if(root.left.val!=root.right.val) return false;

        dq.addLast(root.left);
        dq.addLast(root.right);

        while(dq.size()!=0){
            int size=dq.size();
            // if(size%2!=0) return false;
            for(int i =0;i<size/2;i++){
                TreeNode temp1= dq.removeFirst();
                TreeNode temp2= dq.removeFirst();

                if(temp1.left!=null && temp2.right!=null){
                    if(temp1.left.val!=temp2.right.val) return false;
                    dq.add(temp1.left);
                    dq.add(temp2.right);
                }
                if(temp1.right!=null && temp2.left!=null){
                    if(temp1.right.val!=temp2.left.val) return false;
                    dq.add(temp1.right);
                    dq.add(temp2.left);
                }
                if(temp1.left!=null && temp2.right==null) {
                    return false;
                }
                if(temp1.left==null && temp2.right!=null) {
                    return false;
                }
                if(temp1.right!=null && temp2.left==null) {
                    return false;
                }
                if(temp1.right==null && temp2.left!=null) {
                    return false;
                }
            }
        }
        return true;
    }
}