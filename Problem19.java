// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
         ListNode slow = dummy;
         ListNode fast = dummy;
        dummy.next = head;
        int count=0;
        while(count<=n) // to maintain n spaces between slow and fast pointers
        {
            fast = fast.next;
            count++;
        }
        while(fast!=null) 
        // when fast is null slow exactly stops n+1 th node from end which makes easier to delete n th node from end.
        {
            slow= slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return dummy.next;
        
    }
}