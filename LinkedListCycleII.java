// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :Nope


// Your code here along with comments explaining your approach: i solved this with slow and fast pointer approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                slow= head;
                while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
                }
                return slow;

            }
        }
        return null;
    }
}