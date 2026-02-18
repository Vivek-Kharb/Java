/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode temp=head;
        ListNode sp=head,fp=head;

        int index=0;

        while(true){
            if(fp.next==null){
                return sp;
            }
            else{
                if(fp.next.next==null){
                    return sp.next;
                }
            }
            sp=sp.next;
            fp=fp.next.next;
        }
    }
}