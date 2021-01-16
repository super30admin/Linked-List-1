/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/**
 * Time complexity - O(n)
 * Space complexity - O(1)
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                isCycle = true;
                break;
            }
        }

        if(isCycle)
        {
            slow = head;
            while(slow!=fast)
            {
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }

        return null;
    }
}