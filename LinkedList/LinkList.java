

public class LinkList{
    private Node head;
    private Node tail;
    private int size;

    public LinkList() {
        this.size = 0;

    }

    public void insertUsingRecursion(int value, int index){
            int i=0;

            if(index==0){
                insertUsingRecursion(value,);
            }

    }

    public int deleteAtIndex(int index){
        int value=0;
        if(index >size){
            System.out.println("YOU are deleting OUT OF BOUND INDEX");
            return -1;
        }
        if(index==0){
            value = deleteFirst();
            return value;
        }
       else if(index==size-1){
          value = deleteEndNode();
          return value;
        }
       else {
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            value = temp.next.value;
            temp.next=temp.next.next;
            size--;
            return value;

        }
    }

    public int deleteEndNode(){
        int value= 0;
        if(size==0){
            System.out.println("As Their are ZERO nodes in list, So No Node to be Deleted");
            return -1;
        }
        else if(size==1){
            value= head.value;
                head=null;
                tail=null;
                size--;
            return value;
         }
        else{
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            value=temp.next.value;
            tail=temp;
            tail.next=null;
            size--;
            return value;
        }
    }

    public int deleteFirst(){
        int value=head.value;
        if(size==0){
            System.out.println("As Their are ZERO nodes in list, So No Node to be Deleted");
            return -1;
        }
        else if(size==1){
            head=null;
            tail=null;
            size--;
           }
        else{
            head=head.next;
           }
        size--;
        return value;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head=newNode;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(tail==null){
            insertFirst(val);
            return ;
        }
        tail.next=newNode;
        tail=newNode;
        size++;

    }

    public void insertAtIndex(int val, int index){
        int i=0;

        if(index==0){
            insertFirst(val);
            return ;
        }
        else if(index==size){
            insertAtEnd(val);
            return ;
        }
        else if(index>size){
            System.out.println("you are adding at index greater than size of List");
            return;
         }
        else{
            Node temp=head;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            Node newNode = new Node(val);
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
            return;
        }
    }

    public void printList(){

        if(size==0){
            System.out.println(" As Current Size of List is ZERO, No Node to be Printed");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
            }
        System.out.println("END");
    }

    public void printAddress(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private  int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}