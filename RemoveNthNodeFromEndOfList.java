// 19. Remove Nth Node From End of List
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/


/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;

        // move fast pointer by n nodes
        while(n > 0){
            fast = fast.next;
            n--;
        }

        // if fast is null, n should be 1 hence remove 1st node
        if(fast == null){
            return head.next;
        }

        // move fast and slow
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        // node to be removed is next of slow
        ListNode temp = slow.next;
        slow.next = temp.next;
        temp = null;

        return head;
    }
}