/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode temp1=headA;
        ListNode temp2=headB;



        int size1=1;
        int size2=1;

        while(temp1.next!=null){
            temp1=temp1.next;
            size1++;
        }
        while(temp2.next!=null){
            temp2=temp2.next;
            size2++;
        }

        temp1=headA;
        temp2=headB;
        int difference =size1-size2;

        if(difference<0){
            while(difference<0){
                temp2=temp2.next;
                difference++;
            }
            while(temp1!=null && temp2!=null){
                if(temp1==temp2){
                    return temp1;
                }
                else {
                    temp2=temp2.next;
                    temp1=temp1.next;
                }
            }

        }
        else {
            while(difference>0){
                temp1=temp1.next;
                difference--;
            }
            while(temp1!=null && temp2!=null){
                if(temp1==temp2){
                    return temp1;
                }
                else {
                    temp2=temp2.next;
                    temp1=temp1.next;
                }
            }

        }


        return null;




        // ListNode temp1= headA;
        // ListNode temp2 = headB;

        // while(temp1!=null && temp2!=null){
        //     while(temp2!=null && temp1!=null ){
        //         if(temp1==temp2){
        //             return temp1;
        //         }
        //         temp2=temp2.next;
        //     }
        //     temp2=headB;
        //     temp1=temp1.next;
        // }
        // return null;
    }
}