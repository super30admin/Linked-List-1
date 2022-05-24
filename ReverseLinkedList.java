//Time Complexity: O(n)
//Time Complexity: O(1)

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev  = null;
        ListNode curr = head;
        ListNode fast = curr.next;
        while(fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}
