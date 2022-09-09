/**
## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 
Time Complexity :   O (N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (19. Remove Nth Node From End of List)
Any problem you faced while coding this :       No
 */

// Input: head = [1,2,3,4,5], n = 2
class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // base case
        if(head == null)
            return null;
        
        // create dummy node which will point to head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        // take slow and fast pointer
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // increase the fast pointer to n
        int count = 0;
        while( count <= n){
            fast = fast.next;
            count++;
        }
        
        // increase the slow and fast pointer till fast == null
        while( fast!= null){
            slow = slow.next;
            fast = fast.next;
        }
        
        // delete nth element i.e. slow.next
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}