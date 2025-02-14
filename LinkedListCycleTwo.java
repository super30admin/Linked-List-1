
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * We have 2 pointers - slow and fast. Slow moves by 1 and fast moves by 2. When slow and fast meet that means we have cycle.Then we make any(slow or fast)
 * point to head. This pointer and other pointer moves by 1. Place where they intersect is the start of cycle.
 */
public class LinkedListCycleTwo {
    public ListNode detectCycle(ListNode head) {

        if(head==null || head.next==null){
            return null;
        }
        boolean flag=false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        if(flag){
            fast=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }else{
            return null;
        }
        
    }
}
