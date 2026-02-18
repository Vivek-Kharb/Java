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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n =preorder.length;

        return solve(preorder, postorder, 0, n-1,0);
    }

    TreeNode solve(int[] preorder, int[] postorder, int preorderStart,int preorderEnd ,int postorderStart){
        if(preorderStart > preorderEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preorderStart]);
        if(preorderStart==preorderEnd){
            return root;
        }
        int nextNode = preorder[preorderStart+1];


        int j = postorderStart;
        while(postorder[j]!=nextNode){
            j++;
        }
        int jump= j-postorderStart+1;

        root.left= solve( preorder,postorder, preorderStart+1, preorderStart+jump,postorderStart);
        root.right= solve( preorder, postorder, preorderStart+jump+1, preorderEnd,j+1);


        return root;

    }
}