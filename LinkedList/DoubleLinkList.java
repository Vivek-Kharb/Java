

public class DoubleLinkList{

    int size=0;

    Node head;
    Node tail;

    public Node insertAtHead(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
            newNode.next=newNode;
            newNode.prev=newNode;
            tail=head;
            head.next=null;
            head.prev=null;
            size++;
        }
        else{
            head.prev=newNode;
            newNode.next=head;
            newNode.prev=null;
            head=newNode;
            size++;
        }
        return head;
    }


    public Node insertAtTail(int value){
        if(tail==null){
            return insertAtHead(value);
        }
        else{
            Node newNode = new Node(value);
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
            size++;
            return tail;
        }
    }

    public Node insertAtIndex(int value , int index){
        if(index==0){
             return insertAtHead(value);
        }
       else if (index>=size){
            return insertAtTail(value);
        }
       else {
            Node temp=head;
            Node newNode = new Node(value);
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }

            newNode.next=temp.next;
            temp.next.prev=newNode;
            newNode.prev=temp;
            temp.next=newNode;
            size++;
            return newNode;
        }

    }

    public Node deleteAtHead(){
        if(head==null){
            System.out.println("List is Empty, So head/index can't be deleted");
            return null;
        }
        else{
            Node temp = head;
            head=head.next;
            head.prev=null;
            size--;
            return temp;
        }
    }

    public Node deleteAtTail(){

        if(tail==null){
            System.out.println("List is empty, Tail can't be deleted");
            return null;
        }
        else{
            Node temp=tail;
            tail=tail.prev;
            tail.next=null;
            size--;
            return temp;
        }
    }

    public Node deleteAtIndex(int index){

        Node temp=head;

        if(index==0){
            return deleteAtHead();
        }
        else if (index>=size){
            return deleteAtTail();
        }
        else{
            for(int i =0;i<index-1;i++){
                temp=temp.next;
            }
            Node deletedNode = temp.next;
            temp.next=temp.next.next;
            temp.next.prev=temp;
            size--;
            return deletedNode;
        }

     }

    public Node findNode(int value){
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        System.out.println("Node with "+ value + " value does not exist");
        return null ;
    }


    public void printList(){
        Node temp=head ;

        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }



    public class Node {
        int value;
        Node next;
        Node prev;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}