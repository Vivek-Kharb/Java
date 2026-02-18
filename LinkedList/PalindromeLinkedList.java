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
    // public static ListNode rotate(ListNode head){
    //     ListNode prev=null, temp=head, front=head;
    //     while(temp!=null){
    //         front=temp.next;
    //         temp.next=prev;
    //         prev=temp;
    //         temp=front;
    //     }
    //     head=prev;
    //     return head;
    // }

    ListNode current ;

    public boolean  recur(ListNode head){
        if(head==null) return true;
        boolean ans =  isPalindrome(head.next);
        if(current.val!=head.val) return false;
        current=current.next;
        return ans;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        current=head;
        return recur(head);







        //Stack<Integer> st = new Stack<>();
        // ListNode sp=head,fp=head;
        // while(fp.next!=null && fp.next.next!=null ){
        //     sp=sp.next;
        //     fp=fp.next.next;
        // }
        // sp.next=rotate(sp.next);
        // fp=head;
        // while(sp.next!=null){
        //     if(fp.val!=sp.next.val) {
        //          return false;
        //     }

        //     sp=sp.next;
        //     fp=fp.next;
        // }


        // return true;















        // while(sp!=null){
        //     st.push(sp.val);
        //     sp=sp.next;
        // }

        // sp=head;
        // while(sp!=null){
        //     if(sp.val!=st.pop()) return false;
        //     sp=sp.next;
        // }
        // return true;

    }
}