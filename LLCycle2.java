// Time Complexity : O(n) --> where n is the length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (142): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                flag = true;
                break;
            } 
        }
        
        if (!flag) return null;
        slow = head;
        
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}