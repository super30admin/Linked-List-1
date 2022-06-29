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
        Boolean flag = false;
        ListNode slow= head;
        ListNode fast=head;
        if (head == null) return null;
        //To detect a cycle move fast pointer at 2x speed
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag=true;
                break;
            }
        }
        
        if (!flag) return null;
        //when fast meets slow, reset slow to head , move fast and slow at 1x speed, the point where fast meets slow is the node where the cycle begins
        slow=head;
        
        while (slow != fast) {
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
        
        
        
    }
    
}