// Time Complexity :O(n) n is number of nodes in LinkedList
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        boolean flag=false;
        while(fast!=null && fast.next!=null)  // Detect a cycle if the slow and fast meet
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                flag=true;
                break;
            }
        }
        
        if(!flag) return null; // if no cycle return null 
        
        slow = head; // reset slow 
        
        while(slow!=fast)  // slow and fast untill they meet 
        {
            slow = slow.next;
            fast = fast.next;   
        }
        // point at which slow and fast meet cycle begins
        return slow;
        
    }
}