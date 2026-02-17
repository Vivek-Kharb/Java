/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode fastPointer,slowPointer;


        if(head==null){
            return false;
        }
        if(head.next==head){
            return true;
        }
        if(head.next==null){
            return false;
        }
        if(head.next.next==null){
            return false;
        }
        fastPointer=head.next.next;
        slowPointer=head.next;
        while(fastPointer!= slowPointer){
            if(fastPointer==null || slowPointer==null){
                return false;
            }
            slowPointer=slowPointer.next;
            if(fastPointer.next!=null){
                fastPointer= fastPointer.next.next;
            }
            else
                return false;
        }
        return true;
    }
}