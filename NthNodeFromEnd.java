// Time Complexity : O(n) because we are doing it in one pass
// Space Complexity : O(1) constant space is enough
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

// here, first we put the fast ans slow at dummy head.. then do fast++ in order to create a gap of 'n'
// once created now we do slow++ and fast++until fast is null. then we change the ptr of next to next.next(deleting)
// and return dummy.head at last

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return head;

        // so that if head is removed we can handle exception(not losing head0)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }
}