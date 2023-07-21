// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
//Here we have used the Tortoise and Hare Algorithm. When two pointers slow with speed x and fast with speed 2x are moving in a cycle, the slow pointer will definitely meet the fast pointer at some point. Here we have kept both the pointer at the head of the linked list. Fast moves at 2x speed and slow moves at x. If there is a cycle detected, fast will not be reaching a null pointer. When these pointers keep moving, there will be a point where both these pointers meet. This meeting point is equidistant from the head of the linked list and the node where the cycle is detected. When they meet, we reset the fast pointer to the head of the linked list, because we know that slow and fast are now at the same distance from the node where the cycle is formed. Then we keep moving them with 1x speed and wherever they meet is our answer.


public class Solution {
    ListNode result;
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false; //to indicate if a cycle is present or not

        //if a cycle is detected the fast pointer will not become null and start and fast will meet at some point.
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                flag=true;
                break;
            }
        }
        //if there is no cycle detected, we need to return null
        if(!flag) return null;

        //if there is a cycle detected, we reset the fast pointer to head
        fast=head;
        //the head of the cycle will be where the slow and fast pointer meet
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
    }
}