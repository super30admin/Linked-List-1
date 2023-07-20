// Time Complexity : O(n), where n is the number of nodes in the linked list
// Space Complexity : O(1), no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * 1. Create a dummy node and point it to head and assign it to slow and fast pointers.
 * 2. Move fast pointer by n nodes and then move both slow and fast pointer by one node till fast.next is null.
 * 3. slow pointer will exactly before the nth node from the end and assign slow.next to slow.next.next to remove the nth node.
 * 4. If fast.next is null, then remove the first node.
 * 5. Return head.
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1)
            return null;
        
        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode slow = start, fast = start;

        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        if(fast.next == null){
            return head.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}