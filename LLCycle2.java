// Time Complexity: O(n)
// Space complexity: O(1)

// Approach: 
// We start a slow and fast pointer from the head, slow moves at 1x, fast at 2x.
// When slow and fast meet, we have a cycle. Set the flag to true
// But we need to return the head of the cycle. i.e. from where the cycle begins.
// Reset the slow back to the head of the LL. Fast is still at the meeting point.
// Now move slow and fast at 1x.
// Now when the slow and fast meet again, it is at the start of the cycle.
// Return that node

public class Solution {
    public ListNode detectCycle(ListNode head) {
         if(head==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag=false;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                flag=true;
                break;
            }
        }
        if(!flag) return null;
        slow=head; //move the slow back to the head
        while(slow != fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow; //or fast since both have met at the head of the cycle
        
    }
}