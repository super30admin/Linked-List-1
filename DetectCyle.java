// Time Complexity :  O(N) 
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow){
        ListNode slow2 = head;
        slow = head;
        while (slow !=fast) {
            slow = slow.next;
            fast = fast.next;
            }
            return slow;
            }
        }
        return null;
    }
}