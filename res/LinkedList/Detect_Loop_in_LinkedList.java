class Detect_Loop_in_LinkedList{

    private ListNode head;

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }

    public void detectLoop(){
        ListNode slowpointer=head;
        ListNode fastpointer=head;

        while(fastpointer.next!=null && fastpointer.next.next!=null){

            slowpointer=slowpointer.next;
            fastpointer=fastpointer.next.next;

            if(slowpointer==fastpointer){
                System.out.println("Loop detected");
                return;
            }
        }
        System.out.println("No loop");
    }



  

    public static void main(String[] args) {
        Detect_Loop_in_LinkedList sll=new Detect_Loop_in_LinkedList(); // to have head inside main
        sll.head=new ListNode(10);

        ListNode n2=new ListNode(11);
        ListNode n3=new ListNode(12);
        ListNode n4=new ListNode(14);
        ListNode n5=new ListNode(15);
        ListNode n6=new ListNode(16);
        ListNode n7=new ListNode(17);
        ListNode n8=new ListNode(18);



        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=n6;


        sll.detectLoop();
    

    }

}
