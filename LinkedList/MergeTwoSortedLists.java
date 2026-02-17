public class MergeTwoSortedLists {


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

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode StartNode =new ListNode(0);

            ListNode temp=StartNode;

            while(list1!=null && list2!=null){
                if(list1.val<=list2.val){
                    StartNode.next=list1;
                    list1=list1.next;
                }
                else{
                    StartNode.next=list2;
                    list2=list2.next;
                }
                StartNode=StartNode.next;
            }

            if(list1==null){
                StartNode.next=list2;
            }

            if(list2==null){
                StartNode.next=list1;
            }

            return temp.next;
        }
}
