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

 //Time Complexity: O(n) where n is number of elements in the linked list
 // Space Complexity: O(1) constant space 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle){
            return null;
        }
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;        
    }
}
