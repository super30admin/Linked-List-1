//TC - O(N);
//SC - O(1);
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
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        do{
            if(fast==null || fast.next==null) return null;
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=fast);
        
        slow=head;
        
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
        
    }
}