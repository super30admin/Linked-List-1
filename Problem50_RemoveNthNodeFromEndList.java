// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        int length = 0;
        while(curr != null) {
            length++;
            curr = curr.next;
        }
        length -= n;
        curr = dummy;
        while(length > 0) {
            length--;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }
}