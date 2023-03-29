class Length_of_LinkedList{

    private ListNode head;

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }
    // length of linkedlist
    public void length(){
        int count=0;
        ListNode current=head;
        while (current!=null){
            count++;
            current=current.next;
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        Length_of_LinkedList sll=new Length_of_LinkedList(); // to have head inside main
        sll.head=new ListNode(10);

        ListNode n2=new ListNode(11);
        ListNode n3=new ListNode(12);
        ListNode n4=new ListNode(13);

        //connect nodes together
        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;

       sll.length();

    }

}
