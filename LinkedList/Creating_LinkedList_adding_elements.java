class Main{

    private ListNode head;

    private static class ListNode{
        int data;
        ListNode next;

      // constructor
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static void main(String[] args) {
        Main sll=new Main(); // to have 'head' inside main
        
        //creating head node
        sll.head=new ListNode(10);
        
        //inserting nodes with data
        ListNode n2=new ListNode(11);
        ListNode n3=new ListNode(12);
        ListNode n4=new ListNode(13);

        //connect nodes together
        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;

    }

}