//SC O1 TC On
public class DeleteANodeLL {
    static Node head;


    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args)
    {
        DeleteANodeLL list = new DeleteANodeLL();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(260);

        System.out.println("Given linked list");
        list.printList(head);
        head=deleteNthNode(head,5);
        //  head = list.deleteAnode(head,2);
        System.out.println("");
        System.out.println("deleted linked list ");
        list.printList(head);
    }

    private static Node deleteNthNode(Node head, int i) {
        int c=0;

        Node dummy=new Node(-1);
        Node fast=dummy;
        Node slow=dummy;
        dummy.next=head;
        while(c<=i){
            fast=fast.next;
            c++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //deleteAnode(slow.next);
        Node temp=slow.next;
        slow.next=temp.next;
        temp.next=null;
        return dummy.next;
    }

    private static void deleteAnode(Node s) {
        Node temp=s.next.next;
        s.next=temp;
        //return head;
    }

    private void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
