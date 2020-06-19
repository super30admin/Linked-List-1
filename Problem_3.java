// Time complexity - O(n)
// Space complexity - O(1)

// Two pointer approach

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
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        
        if(!flag){
            return null;
        }
        ListNode n = head;
        while(slow != n){
            slow = slow.next;
            n = n.next;
        }
    return slow;
    }
}
