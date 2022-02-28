// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //curr.next has already seen index
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // if they meet cycle exists
                //get the node
                slow = head;
                while(slow != fast){
                    slow=slow.next;
                    fast = fast.next;
                }
                return slow;
            }
                
        }
        return null;
}
}