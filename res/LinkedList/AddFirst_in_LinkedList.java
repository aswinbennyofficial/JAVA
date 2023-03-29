
class AddFirst_in_LinkedList{

    private ListNode head;

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }

    public void addFirst(int data){

        ListNode newNode=new ListNode(data);
        newNode.next=head;
        head=newNode;
    }

    public void display(){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println(" Null");
    }


    public static void main(String[] args) {
        AddFirst_in_LinkedList sll=new AddFirst_in_LinkedList(); // to have head inside main
        sll.head=new ListNode(10);

        ListNode n2=new ListNode(11);
        ListNode n3=new ListNode(12);
        ListNode n4=new ListNode(13);

        //connect nodes together
        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;

       sll.addFirst(9);
       sll.addFirst(8);
       sll.addFirst(7);
       sll.display();

    }

}
