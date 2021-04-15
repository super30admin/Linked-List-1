// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// Your code here  with comments explaining your approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = temp;
        // move slow pointer till n+1 distance of fast
        for (int i = 1; i <= n + 1; i++) {
            slow = slow.next;
        }
        // Move slow to the end along with fast
        while (slow != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // point the next pointer to the next.next to remove
        fast.next = fast.next.next;
        return temp.next;
    }
}