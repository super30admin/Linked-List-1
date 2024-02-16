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
 //Two pointers, slow and fast, are initialized to the head of the linked list. They traverse the list at different speeds.
//If there is a cycle, the pointers will meet at some point. Set a flag to indicate the presence of a cycle.
//If a cycle is detected, reset one pointer to the head and move both pointers one step at a time until they meet; the meeting point is the start of the cycle.
//Time Complexity: O(N) - The algorithm traverses the list once.
//Space Complexity: O(1) - The algorithm uses constant extra space.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if (fast == null || fast.next == null) return null;
       
         while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
        
    }
}