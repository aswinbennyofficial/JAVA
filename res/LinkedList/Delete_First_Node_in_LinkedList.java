
class Delete_First_Node_in_LinkedList{

    private ListNode head;

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }

    public ListNode delFirst(){
        if(head==null){
            return null;
        }
        ListNode temp=head;

        head=head.next;
        temp.next=null;
        return temp;

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
        Delete_First_Node_in_LinkedList sll=new Delete_First_Node_in_LinkedList(); // to have head inside main
        sll.head=new ListNode(10);

        ListNode n2=new ListNode(11);
        ListNode n3=new ListNode(12);
        ListNode n4=new ListNode(13);

        //connect nodes together
        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;

        System.out.println(sll.delFirst().data);
       //sll.delFirst();
       sll.display();

    }

}
