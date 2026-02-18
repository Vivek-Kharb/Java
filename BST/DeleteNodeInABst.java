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

    public TreeNode findSuccessor(TreeNode node){
        while(node.left!=null){
            node=node.left;
        }
        return node;
    }
    public TreeNode deleteNode(TreeNode root, int value) {
        if(root==null) return null;

        if(value<root.val){
            root.left = deleteNode(root.left, value);
        }
        else if (value>root.val){
            root.right = deleteNode(root.right,value);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if (root.left==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }
            else{
                TreeNode temp = findSuccessor(root.right);
                root.val=temp.val;
                root.right = deleteNode(root.right, temp.val);
            }
        }

        return root;







        //  if(root==null) return null;
        //   TreeNode temp=root;
        //   TreeNode predecessor = null;
        //    while(true){
        //         if(temp.val==value) break;
        //         if(value<temp.val){
        //             predecessor=temp;
        //             temp=temp.left;
        //         }
        //         else{
        //             predecessor=temp;
        //             temp=temp.right;
        //         }
        //         if(temp==null) return root;
        //     }
        //     System.out.println(temp.val);
        //    if(temp==root){
        //         if(temp.left==null && temp.right==null){
        //             root=null;
        //             return root;
        //         }
        //        else if(temp.left==null){
        //              root=root.right;
        //              return root;
        //         }
        //         else if(temp.right==null){
        //              root=root.left;
        //              return root;
        //         }
        //         else{
        //             TreeNode successor = temp.right;
        //             predecessor=temp;
        //             while (successor.left != null) {
        //                 predecessor=successor;
        //                 successor = successor.left;
        //             }
        //             temp.val=successor.val;
        //             if(successor.left==null && successor.right==null && predecessor==temp){
        //                  predecessor.right=null;
        //             }
        //             else if(successor.left==null && successor.right==null){
        //                     predecessor.left=null;
        //             }
        //             else if (successor.left==null && predecessor==temp){
        //                 predecessor.right=successor.right;
        //             }
        //             else if (successor.left==null){
        //                 predecessor.left=successor.right;
        //             }
        //             else{
        //                 predecessor.right=successor.right;
        //             }
        //             return root;
        //         }
        //        // return root;
        //    }
        //    if(temp.left==null && temp.right==null){
        //         if(value<predecessor.val) predecessor.left=null;
        //         else predecessor.right=null;
        //         return root;
        //     }
        //     else if(temp.left==null){
        //         if(temp.val<predecessor.val)
        //             predecessor.left=temp.right;
        //         else
        //             predecessor.right=temp.right;

        //             return root;
        //     }
        //     else if(temp.right==null){
        //             if(temp.val<predecessor.val)
        //                 predecessor.left=temp.left;
        //              else
        //                 predecessor.right=temp.left;

        //                 return root;
        //     }
        //     else{
        //            TreeNode successor = temp.right;
        //             predecessor=temp;
        //             while (successor.left != null) {
        //                 predecessor=successor;
        //                 successor = successor.left;
        //             }
        //             temp.val=successor.val;
        //             if(successor.left==null && successor.right==null && predecessor==temp){
        //                  predecessor.right=null;
        //             }
        //             else if(successor.left==null && successor.right==null){
        //                     predecessor.left=null;
        //             }
        //             else if (successor.left==null && predecessor==temp){
        //                 predecessor.right=successor.right;
        //             }
        //             else if (successor.left==null){
        //                 predecessor.left=successor.right;
        //             }
        //             else{
        //                 predecessor.right=successor.right;
        //             }

        //             return root;
        //     }
        //return root;
    }
}