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

// Time: O(n)
// Space: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head, slow = head;
        while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                while(head!= fast){
                    fast = fast.next;
                    head = head.next;
                }
                return head;
            }
        }
        return null;
        
    }
}