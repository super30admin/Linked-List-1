---- iterative Solution ----
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

--- Recurssive Solution ---
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


public class ReverseLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseListIteratively(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        while(next != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }

    public ListNode reverseListRecurssively(ListNode head) {
        //base
        if(head == null || head.next == null) return head;
        //recurssive condition
        ListNode reversed = reverseListRecurssively(head.next);
        head.next.next = head;
        head.next = null;

        return reversed;

    }
}
