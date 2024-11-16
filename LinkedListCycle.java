// Approach 1: Brute Force with extra space - Hashset stores nodes directly
// Time : O(2n)
// space : O(n)


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
 // Approach : Two Pointer Approach
 // Time : O(2n) // Form cycle and finding where the cycle began
 // Space : O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head; 
        boolean flag = false;
        // Try to form a cycle by moving slow by 1x and move fast by 2x
        while(fast != null && fast.next != null){
            slow = slow.next; // 1x
            fast = fast.next.next; //2x
            if(slow == fast){
                flag = true;
                break;
            }
        }
        // check if cycle is formed
        if(flag){
            slow= head; // reset slow pointer to head
        } else{
            return null;
        }
        
        // keep moving slow and fast at same speed until they meet
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }
}