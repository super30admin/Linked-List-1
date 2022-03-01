// Time Complexity :O(L)  L=List size
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

//approach: Using two pointers, one fast and another slow find a point where they meet . If they dont meet , there is now cycle otherwise return slow position.

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){  
                break;
            }
        }
        
        if(fast==null||fast.next==null){
            return null;
        }
        slow=head;
        while(slow !=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}