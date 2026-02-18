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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);

        int levelX = findLevel(root,xx, 0);
        int levelY = findLevel(root,yy, 0);

        if(levelX!=levelY) return false;
        if(isSibling(root,xx,yy)) return false;

        return true;

    }

    public int findLevel(TreeNode root, TreeNode xx, int level){
        if(root==null) return 0;
        if(root==xx) return level;
        int ll = findLevel(root.left, xx, level+1);
        if(ll==0){
            ll = findLevel(root.right, xx, level+1);
        }
        return ll;
    }

    public TreeNode findNode(TreeNode root, int x){
        if(root==null ) return null;
        if(root.val==x) return root;
        TreeNode xx= findNode(root.left,  x);
        if(xx==null){
            xx = findNode(root.right,  x);
        }
        return xx;
    }

    boolean isSibling(TreeNode root, TreeNode x, TreeNode y){
        if(root==null) return false;

        if((root.left==x && root.right==y) ||(root.left==y && root.right==x))
            return true;
        else
            return isSibling(root.left, x,y) || isSibling(root.right, x,y);
    }
}