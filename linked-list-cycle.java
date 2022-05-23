//Time Complexity: O(n) n is number of nodes
//Space Complexity:o(1)
//Did this code successfully run on Leetcode :Yes
class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean containsCycle = false;
        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                containsCycle = true;
                break;
            }
        }
        if (containsCycle) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } else {
            return null;
        }
    }
}