// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

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
class RemoveNth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = null;
        ListNode fast = head;
        
        n++;
        while(n>1 && fast!=null) {
            fast = fast.next;
            n--;
        }

        if(fast != null) {
            slow = head;
            while(fast.next!=null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        
        if(slow!=null && slow.next!=null)
            slow.next = slow.next.next;
        else if(fast == null)
            return head.next;
        else
            slow = null;
        
        return head;
    }
}
