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
    public ListNode reverseList(ListNode head) {

        if(head=null|| head.next==null) return head;

        head.next = reverseList(head.next);


        return head;
        // if(head==null || head.next==null) return head;
        // ListNode temp=head, front=head, prev=null;

        // while(temp!=null){
        //     front=temp.next;
        //    temp.next=prev;
        //    prev=temp;
        //    temp=front;
        // }
        // head=prev;
        // return head;



        // if(head==null || head.next==null) return head;
        // Stack<ListNode> st = new Stack<>();

        // ListNode tail, temp=head;
        // while(temp!=null){
        //     st.push(temp);
        //     temp=temp.next;
        // }

        // head=st.pop();
        // temp=head;
        // tail=head;
        // while(!st.isEmpty()){
        //     temp=st.pop();
        //     tail.next=temp;
        //     tail=temp;
        //     tail.next=null;
        // }
        // return head;
    }
}