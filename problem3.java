// Linked List Cycle II
// solved on leetcode
// Time Complexity - O(n)
// Space Complexity - O(1)


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
        
     
        ListNode slow=head;
        ListNode fast=head;
        // boolean cycle =false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(fast==slow){
                // cycle=true;
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        
        slow=head;
        
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        // if(cycle==false){
        //     return null;
        // }
        return fast;
    }
}