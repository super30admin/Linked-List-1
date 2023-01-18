// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//in this approach we have a slow and fast pointer, slow moves by 1 and fast moves by 2. When both meet we find a cycle. then we 
//reset one of them to head and move both by 1. We find the head of the cycle. 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head== null)return null;
        ListNode slow= head;
        ListNode fast = head;
        boolean flag = false;
        //check if cycle is there
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        //find the index of cycle
        if(!flag)return null;
        fast = head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
        
    }
}
