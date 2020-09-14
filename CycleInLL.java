// Time Complexity :O(n) since we are looking at each node once
// Space Complexity : O(1) requires constant space
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

// we have two ptrs slow and fast starting from head.. we reach the point when they overlapp.
// the distance from this insertion point of the cycle is equal to the start of the ll to that insertion pt
// so we place the slow at the beginning of the list and do slow ++ and fast++ until we reach the insertion pt
// and return the answer

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head, fast = head;

        do {
            if (fast == null || fast.next == null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}