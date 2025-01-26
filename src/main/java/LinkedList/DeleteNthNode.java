package LinkedList;

/**
 * TimeComplextiy O(N)
 * SpaceComplexity : Constant O(1)
 */
public class DeleteNthNode {
    public static void main(String[] args) {

        DeleteNthNode deleteNthNode = new DeleteNthNode();
        ListNode head = new ListNode(5);
        head.next = new ListNode(6);
        head.next.next = new ListNode(7);
        deleteNthNode.removeNthFromEnd(head, 2);
        deleteNthNode.printList(head);
    }

    public void printList(ListNode head) {
        System.out.println("Reversed Linked List : ");
        ListNode temp = head;
        while( temp!= null ){
            System.out.print("Node : "+temp.val+ " ");
            temp = temp.next;
        }
        System.out.println( "\n");
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n <= 0 || head == null) {
            return head;
        }

        // calculating the prev as handy
        ListNode prev = new ListNode();
        prev.next = head;
        head = prev;


        // calculate the distance
        int count = 0;
        ListNode fast= head.next;
        ListNode slow= head.next;

        // incrementing the fast and the count pointers
        while(count<n && fast!=null) {
            fast = fast.next;
            count++;
        }

        if(fast == null && count !=n){
            return head.next;
        }

        // incrementing the slow and the fast pointers
        while(fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next=prev.next.next;
        return head.next;
    }
}
