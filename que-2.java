// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;fast = fast.next.next;
            if(slow == fast){
                //cycle
                ListNode dummy = head;
                while(dummy != slow){
                    slow = slow.next;
                    dummy = dummy.next;
                }
                return slow;
            }
        }
       return null;     
    }
    
}