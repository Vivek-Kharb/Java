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
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        int CurrentValue=head.val;

       ListNode temp=head;
        ListNode currentNode=head;
        
        
        while(temp.next!=null){
            while(CurrentValue == temp.next.val){
                temp=temp.next;
                if(temp.next==null ){
                    currentNode.next=null;
                    return head;
                }
            }
            {
                temp=temp.next;
                currentNode.next=temp;
                currentNode=temp;
                CurrentValue=temp.val;
            }
        }
        return head; 
    }
}