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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;

        return solve(inorder, postorder, 0, n-1,0,n-1);
    }

    TreeNode solve(int[] inorder, int[] postorder,
                   int inorderStart, int inorderEnd,
                   int postorderStart, int postorderEnd){

        if(inorderStart  > inorderEnd){
            return null;
        }
        int rootValue = postorder[postorderEnd];

        int i = inorderStart;

        for(;i<=inorderEnd;i++){
            if(inorder[i]==rootValue){
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);

        int leftSize = i-inorderStart;
        int rightSize = inorderEnd -i;

        root.left= solve(inorder, postorder, inorderStart, i-1,postorderStart, postorderStart+leftSize-1);
        root.right = solve(inorder, postorder, i+1, inorderEnd,postorderEnd-rightSize,postorderEnd-1);

        return root;
    }
}