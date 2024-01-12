
//TC On SC O1
public class RevLinkList {
    static Node head;
    Node reversed;

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
        RevLinkList list = new RevLinkList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }



    public Node reverse(Node head) {
        if(head==null)return null;
        helper(head);
        return reversed;



    }
    private void helper(Node head){
        if(head.next==null){
            reversed=head;
             return ;

        }

        helper(head.next);
        head.next.next=head;
        head.next=null;

    }




    private void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}
