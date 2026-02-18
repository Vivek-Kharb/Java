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
    public ListNode deleteMiddle(ListNode head) {

        ListNode sp=head,fp=head;

        if(fp.next==null){
            return null;
        }
        // if(fp.next.next==null){
        //     head.next=null;
        //     return head;
        // }

        while(fp.next.next!=null && fp.next.next.next!=null){
            sp=sp.next;
            fp=fp.next.next;
        }
        sp.next=sp.next.next;
        return head;

        //ListNode beforeSp = null;

        // if(head.next==null){
        //     return null;
        // }
        // if(head.next.next==null){
        //     head.next=null;
        //     return head;
        // }
        // while(fp.next!=null && fp.next.next!=null){
        //     beforeSp = sp;
        //     sp=sp.next;
        //     fp=fp.next.next;
        //     if(fp.next!=null && fp.next.next==null){
        //          beforeSp = sp;
        //     }
        // }
        // beforeSp.next=beforeSp.next.next;
        // return head;
    }
}