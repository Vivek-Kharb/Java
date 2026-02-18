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

    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return solve(preorder, inorder, 0, n-1);
    }

    TreeNode solve(int[] preorder, int[] inorder, int inorderStart, int inorderEnd){
        if(start > end  ){
            return null;
        }

        int rootValue = preorder[index];
        int i = start;

        for(;i<=end;i++){
            if(inorder[i]==rootValue){
                break;
            }
        }

        index++;
        TreeNode root = new TreeNode(rootValue);

        root.left= solve(preorder, inorder, start, i-1);
        root.right = solve(preorder, inorder, i+1, end);

        return root;
    }
}