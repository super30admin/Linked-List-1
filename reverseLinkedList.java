// Time Complexity : O(N), where N is the number of nodes in the linked list  
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes  
// Any problem you faced while coding this : No  

// Approach:  
// Initialize two pointers prev as null and dup as head  
// Iterate through the list, reverse the current node’s pointer, then move both dup and prev forward  
// Return prev as the new head of the reversed linked list  

public class reverseLinkedList {
    public class ListNode 
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) 
    {
        ListNode dup = head;
        ListNode prev = null;
        while(dup !=null)
        {
            ListNode temp = dup.next;
            dup.next = prev;
            prev = dup;
            dup = temp;
        }
        return prev;
    }
}
