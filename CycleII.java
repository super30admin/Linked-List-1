// Time complexity: O(n)
// Space Complexity : O(1)

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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return head;
        }
        boolean isCycle = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                isCycle = true;
                break;
            }
        }
        if(!isCycle){
            return null;
        }
        fast = head;
        while(fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }
}