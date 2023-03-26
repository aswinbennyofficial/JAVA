
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


    public void deleteKey(int k){
        ListNode current=head;
        ListNode previous=null;
        if(current.data==k){
            head=current.next;
            return;
        }
        while (current!=null){
            if(current.data==k){
                previous.next=current.next;
            }
            previous=current;
            current=current.next;
        }
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
        ListNode n4=new ListNode(14);
        ListNode n5=new ListNode(15);

        //connect nodes together
        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;


       sll.deleteKey(14);
        sll.display();

    }

}
