// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashSet;
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null; // No cycle in a linked list with 0 or 1 node
        }

        HashSet<ListNode> visitedNodes = new HashSet<>();

        ListNode curr = head;
        while (curr != null) {
            if (visitedNodes.contains(curr)) {
                return curr; // Found the node where the cycle begins
            }
            visitedNodes.add(curr);
            curr = curr.next;
        }

        return null; // No cycle found

    }
}