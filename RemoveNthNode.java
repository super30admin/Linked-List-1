// Time Complexity :O(n) n is number of nodes in LinkedList
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head; 
        ListNode fast = dummy; // Use two nodes
        ListNode slow = dummy;
        int count = 0;
        
        while(count<=n)
        {
            fast = fast.next;    // Move fast first to create the difference n
            count++;
        }
        
        while(fast!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        // slow points to the n+1 th node from the end 
        
        slow.next = slow.next.next;  
        
        
        return dummy.next;
    }
}