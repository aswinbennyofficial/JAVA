
class Middle_Node_of_LinkedList{

    private ListNode head;

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }


    public void middleNode(){
        ListNode fastpointer=head;
        ListNode slowpointer=head;

        while(fastpointer!=null && fastpointer.next!=null){
            slowpointer=slowpointer.next;
            fastpointer=fastpointer.next.next;
        }

        System.out.println(slowpointer.data);
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
        Middle_Node_of_LinkedList sll=new Middle_Node_of_LinkedList(); // to have head inside main
        sll.head=new ListNode(10);

        ListNode n2=new ListNode(11);
        ListNode n3=new ListNode(12);
        ListNode n4=new ListNode(13);
        ListNode n5=new ListNode(14);

        //connect nodes together
        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;


       sll.middleNode();
       //sll.display();

    }

}
