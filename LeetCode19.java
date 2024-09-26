// Time Complexity : O(n) --> where n is length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (19): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        while (count <= n) {
            fast = fast.next;
            count++;
        }
        
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // slow is at the node prev to the node to be removed       
        slow.next = slow.next.next;
        return dummy.next;
    }
}