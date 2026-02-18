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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int counter = 0;
        ListNode leadingNode = head;
        ListNode trailingNode = head;
        ListNode temp=head;

        if(head.next==null){
            return null;
        }
        for(int i=1;i<=n;i++){
            leadingNode= leadingNode.next;
        }
        if(leadingNode==null){
            head= head.next;//=trailingNode.next.next;
            return head;
        }
        while(leadingNode.next!=null){
            leadingNode=leadingNode.next;
            trailingNode=trailingNode.next;
        }
        trailingNode.next=trailingNode.next.next;
        return head;



        //     ListNode temp=head;
        //     int size = 1;
        //     while(temp!=null && temp.next!=null){
        //         size++;
        //         temp=temp.next;
        //     }

        //     temp=head;
        //     if(size-n==0){
        //         head=head.next;
        //         return head;
        //     }
        //     while(size-n>1){
        //         temp=temp.next;
        //         size--;
        //     }
        //     temp.next=temp.next.next;

        //    return head ;
    }
}