
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


    public void insertInSorted(int k){
        ListNode newNode=new ListNode(k);
        ListNode current=head;

        while (current!=null && current.next!=null){
            if(newNode.data > current.data && newNode.data<=current.next.data){
                newNode.next=current.next;
                current.next=newNode;
            }

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


        sll.insertInSorted(14);
        sll.display();

    }

}
