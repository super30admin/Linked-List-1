// Time Complexity : O(n), where n is the length of the linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -

// Approach:
// Move a pointer dup n steps ahead to maintain a gap of n between dup and two  
// Traverse both pointers until dup reaches the end, keeping track of the previous node  
// Remove the target node by skipping it with prev.next = two.next or handle head removal if prev is null  


public class removeNthNode {
    public class ListNode 
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int z = 0;
        ListNode dup = head;
        while(z!=n)
        {
            dup = dup.next;
            z++;
        }
        ListNode prev = null;
        ListNode two = head;
        while(dup!= null)
        {
            prev = two;
            dup = dup.next;
            two = two.next;
        }
        if(prev == null)
        {
            return two.next;
        }
        prev.next = two.next;
        return head; 
    }
}
