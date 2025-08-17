
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


//we use slow and fast pointer approach to detect cycle in linked list where slow pointer moves one step 
// and fast pointer moves two steps , if they meet then there is a cycle.
//we move one pointer to the head and keep the other at the meeting point, 
// the point they meet again is the start of the cycle.

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        boolean flag=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){         // If slow and fast pointers meet, there is a cycle
                flag=true;
                break;
            }
        }
        if(!flag) return null;

        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}