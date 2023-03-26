
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

   public void lastNthNode(int k){
        ListNode refPointer=head;
        ListNode mainPointer=head;
        int i=0;
        while(i<k){
            refPointer=refPointer.next;
            i++;
        }
        while(refPointer!=null){
            refPointer=refPointer.next;
            mainPointer=mainPointer.next;
        }
       System.out.println(mainPointer.data);
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
        ListNode n5=new ListNode(14);

        //connect nodes together
        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;


        sll.lastNthNode(1);
       //sll.display();

    }

}
