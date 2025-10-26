// Time Complexity : O(2n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/*
 * Approach
 * Here are using 2 pointer, slow and fast
 * firstly we will make the move fast pointer by n + 1 postion
 * n + 1 because to remove a node we need to be at the previous node 
 * so that next pointer can be changed
 * 
 * then we will ittereate both slow and fast pointer till fast reaches null
 * at which point the slow will be at n - 1 postion
 * and we remove the node
 * 
 * we start at the dummy note so that we can remove the first node with the same logic 
 * 
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int i = 0;
        while (i <= n) {
            fast = fast.next;
            i++;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode cur = slow.next;
        slow.next = slow.next.next;
        cur.next = null;
        return dummy.next;

    }
}