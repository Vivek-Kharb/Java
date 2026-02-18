/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node currentNode=root;
        if(root==null || (root.left==null)) {
            return root;
        }
        Node leftNode=currentNode.left;
        while(leftNode!=null){
            currentNode.left.next=currentNode.right;
            while(currentNode.next!=null){
                currentNode.right.next=currentNode.next.left;
                currentNode=currentNode.next;
                currentNode.left.next=currentNode.right;
            }
            currentNode=leftNode;
            leftNode=currentNode.left;
        }
        return root;
    }
}