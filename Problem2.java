// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * Using fast and slow pointers. Created a dummy node in front of the list if n-th node is asked to be removed from the list with n elements,
 * First moved the fast pointer to n items on the list. Then moving the slow and fast point until fast.next is not null.
 * So that we can point the n-1 node n+1 node
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        ListNode fast = dummy;
        ListNode slow = dummy;
        int count = 0;
        while(count < n) {
            fast = fast.next;
            count++;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        if (temp != null)
            slow.next = temp.next;
        temp = null;

        return dummy.next;

    }
}