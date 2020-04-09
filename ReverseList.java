// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev,dummy;
        dummy = null;
        prev = null;
        
        while(head != null)
        {
            
            dummy = head;
            head = head.next;
            dummy.next = prev;
            prev = dummy;
        }
        return dummy;
        
    }
}