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
    /*
    Time complexity: O(n)
    Space complexity: O(1)
    */
    
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // traverse the list to find cycles
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            // found a cycle
            if(slow == fast){
                ListNode dummy = head;
                // when dummy and slow will be equal then 
                // point where the cycle starts is reached
                while(dummy != slow){
                dummy = dummy.next;
                slow = slow.next;
                }
                // point where the cycle starts
                return slow;
            }
            
        }
        // return null if there is no cycle
        return null;
    }
}