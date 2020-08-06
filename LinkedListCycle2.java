// Time Complexity : O(N) where N is number of nodes in LL
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We have to use two pointers to identify whether there are cycle or not in LL. Once we determine there is a cycle,
// we reset the slow pointer to the head. Then, we increment slow and fast pointer one by one, which results in meeting slow
// and fast at the beginning of the cycle.

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        if (slow.next == slow) return slow;
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x, ListNode head) {
        val = x;
        next = null;
    }
}
