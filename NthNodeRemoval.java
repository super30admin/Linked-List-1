// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(n) since we are iterating through the entire list
//Space Complexity: O(1) since we are not taking any extra space
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // slow at 1 
        // fast at 1
        // move fast until n to create n distance
        // now traverse until end of the linked list at 1x time move for each slow and fast pointer
        // As soon as fast reaches the end of the linked list, slow would be at the position
        // where we need to remove the node
        //slow.next = slow.next.next; 
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        int count = 0;
        while(count < n){
            fast = fast.next;
            count++;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}