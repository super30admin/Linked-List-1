// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*
Add an extra node with value -1 to cover the edge case when you need to remove the last node. 
 * Use two pointers. Maintain a gap of count between the two nodes. 
 * The point before the slow pointer has to be removed. 
 * Change slow.next to slow.next.next and change the slow.next to null. 
 * Return dummy.next value as head to ignore the -1. 
 */

public class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n) { 
        ListNode dummy = new ListNode(-1);
        dummy.next = head; 
        ListNode slow = dummy; 
        ListNode fast = dummy; 
        int count = 0;
        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next; 
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next; 
        temp.next = null;
        return dummy.next;
    }
}
