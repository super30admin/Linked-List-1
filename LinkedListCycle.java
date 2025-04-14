// Time Complexity : O(N), where N is the number of nodes in the list  
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes  
// Any problem you faced while coding this : No  

// Approach:  
// Use two pointers (slow and fast) to detect cycle using Floyd's Tortoise and Hare algorithm  
// If cycle is detected, reset one pointer to head and move both one step at a time  
// The node where they meet is the start of the cycle  


public class LinkedListCycle {
    public class ListNode 
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while( fast != null && fast.next!=null )
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                break;
            }
        }
        if(fast == null || fast.next == null )
        {
            return null;
        }
        fast = head;
        while(slow!=null)
        {
            if(fast == slow)
            {
                return slow;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}
