
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

    public void delAt(int k){
        int i;
        ListNode previous = null;
        ListNode current = head;
        if(k==1){
            head=head.next;
            return;
        }
        for (i = 1; i < k; i++) {
            previous = current;
            current = current.next;
        }
        if(current!=null) {
            previous.next = current.next;
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
        ListNode n4=new ListNode(13);

        //connect nodes together
        sll.head.next=n2;
        n2.next=n3;
        n3.next=n4;


       sll.delAt(3);
       sll.display();

    }

}
