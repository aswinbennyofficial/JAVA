
class Main{

    private ListNode head;

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }

    public ListNode delLast(){
       if(head==null || head.next==null){
           return head;
       }

       ListNode previous=null;
       ListNode current=head;

       while (current.next!=null){
           previous=current;
           current=current.next;
       }

       previous.next=null;
       return current;

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
        Main sll=new Main(); // to have head inside main
        sll.head=new ListNode(10);

        ListNode n2=new ListNode(11);
        ListNode n3=new ListNode(12);
        ListNode n4=new ListNode(13);

        //connect nodes together
        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;

        System.out.println(sll.delLast().data);
       //sll.delLast();
       sll.display();

    }

}
