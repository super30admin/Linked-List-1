//Time Complexity : O(n)
//Space Complexity : O(1)

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while(head != null) {
        ListNode temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
    }

        return prev;
}
}
