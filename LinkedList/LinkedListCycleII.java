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
    public ListNode detectCycle(ListNode head) {
        ListNode fp=head,sp=head,temp=head;
        while(true ){
            if(fp == null || fp.next==null || fp.next.next==null)
                return null;
            fp=fp.next.next;
            sp=sp.next;
            if(fp==sp){
                break;
            }
        }
        temp=head;
        while(temp!=sp){
            temp=temp.next;
            sp=sp.next;
        }
        return sp;
    }
}