// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
public ListNode detectCycle(ListNode head) {
    if(head == null) return null;
    
    ListNode slow = head;
    ListNode fast = head;
    boolean hasCycle = false;
    
    while(fast != null && fast.next != null){
        slow=slow.next; //moving 1
        fast = fast.next.next; //moving 2
        if(slow == fast){ // if they match then cycle exists
            hasCycle=true;
            break;
        }
    }
    
    if(!hasCycle) return null; // if doesn't match, then cycle doesn't exist
    
    slow=head;
    
    while(slow != fast){
        slow=slow.next;
        fast=fast.next;
    }
    
    return slow;
}