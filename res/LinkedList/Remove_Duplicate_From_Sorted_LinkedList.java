
class Remove_Duplicate_From_Sorted_LinkedList{

    private ListNode head;

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }


    public void removeDuplicate(){
        ListNode current=head;

        while(current.next!=null && current!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }

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
        Remove_Duplicate_From_Sorted_LinkedList sll=new Remove_Duplicate_From_Sorted_LinkedList(); // to have head inside main
        sll.head=new ListNode(10);

        ListNode n2=new ListNode(12);
        ListNode n3=new ListNode(12);
        ListNode n4=new ListNode(12);
        ListNode n5=new ListNode(14);

        //connect nodes together
        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;


        sll.removeDuplicate();
        sll.display();

    }

}
