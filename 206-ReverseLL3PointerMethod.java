/** LC-206
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No.
 *Algo:
 * We use three pointers: Prev, curr and fast. All increment with 1 only.
 * 1. Init. prev = null
 *          curr = head
 *          fast = curr.next
 * 2. Now we just reverse the pointers...so curr.next will point to prev...
 * 3. This way no extra memory is used.    
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
      //  1->2->3->4->5
        if(head == null) return null;
        if(head.next == null) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = curr.next;
        
        while(fast.next != null){
            
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        
        curr.next = prev;
        fast.next = curr;
        return fast;
    }
}