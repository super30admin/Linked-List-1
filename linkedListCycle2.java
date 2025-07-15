
// Time Complexity : O(n) -> Traversing all nodes
// Space Complexity : O(1) -> No extra space required
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //basecase
        if(head == null){
            return null;
        }

        boolean hasCycle = false;
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        //slow-fast pointer approach
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(slowPtr == fastPtr){
                hasCycle = true;
                break;
            }
        }
        
        //if no cycle is detected return null
        if(!hasCycle){
            return null;
        }

        //reset fast to the head
        fastPtr = head;

        //move both pointers one step at a time until they are equal, 
        //the node where they meet is the node where the cycle begins.
        while(slowPtr != fastPtr){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        return fastPtr;
    }
}