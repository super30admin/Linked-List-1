// Time Complexity : O(n) - If cycle present then traversing Number of times the cycle; if not present then traversing N Nodes.
// Space Complexity : O(1) - Just storing the node reference
// Did this code successfully run on Leetcode : Yes; (https://leetcode.com/submissions/detail/673113493/)
// Any problem you faced while coding this : No
// My Notes : 
// 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){return null;}
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        boolean isCycleFound = false;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                isCycleFound = true;
                //System.out.println(" Cycle found at : "+slowPtr.val);
                break;
            }
        }
        // From the point cycle is found; move 1 ptr from the start and other from the cycle detection point.
        // The point where they meet is the start of the cycle.
        slowPtr = head;
        if(isCycleFound){
            while(fastPtr!=slowPtr){
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
            return slowPtr;
        }
        return null;
    }
}