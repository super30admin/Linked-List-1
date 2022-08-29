// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: 
/*
* We first move the fast pointer until it exceeds n, then we move both slow and fast pointers until 
* fast reaches null, we need to change the next pointer of the slow.
* Reason to add dummy - if we need to remove the first node, then we will not have access to the head 
* so it is important to have a dummy node at the beginning
*/

public class RemoveNth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        while(count <= n)
        {
            fast = fast.next;
            count++;
        }
        
        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
    }
}
