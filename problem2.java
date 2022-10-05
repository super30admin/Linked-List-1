package Linked-List-1;

public class problem2 {
// Time Complexity : O(n) n -> number of nodes.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
    public ListNode removeNthFromEnd(ListNode head, int n) {
     
        ListNode dummy = new ListNode(-1);
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        dummy.next = head;
        
        while(count <= n){
            fast = fast.next;
            count++;
        }
        
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}
