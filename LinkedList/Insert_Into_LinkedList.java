
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

    public void insertInto(int data, int k){
        ListNode newNode=new ListNode(data);
        int i;
        ListNode current=head;
        for(i=1;i<k-1;i++){
            if(current.next==null){
                break;
            }
            current=current.next;
        }

        newNode.next=current.next;
        current.next=newNode;
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

       sll.insertInto(99,1);
       sll.display();

    }

}
