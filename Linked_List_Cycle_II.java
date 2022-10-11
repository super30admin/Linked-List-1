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
        int max  = Integer.MAX_VALUE;
        
        ListNode fast = head;
        ListNode slow = head;
        boolean cycle = false;
        
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if(!cycle) return null;
        fast = head;
        
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.val);
        return slow;
    }
}
