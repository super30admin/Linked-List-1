//TC:O(n)
//SC:O(1)
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // System.out.println(head);
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
