// Time Complexity : O(n) n -> num of nodes in linkedlist
// Space Complexity : O(1) no aux data
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : issues getting to the node to be deleted,  getting proper breaking conditions for loops

public class RemoveNthFromEnd {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null || head.next == null) return null;

            ListNode start = new ListNode(0);
            ListNode slow = start, fast = start;
            slow.next = head;

            //fast n nodes ahead of slow
            while (n >= 0) {
                fast = fast.next;
                n--;
            }

            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;
            return start.next;
        }
}
