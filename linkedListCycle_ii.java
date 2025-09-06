/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// Time Complexity: O(n)(Actually 2n which is and constants are ignored in Big O notation)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * The main intuition here is, once the slow and fast pointer meet, we can be sure that there is a cycle in the linked list. 
 * Now, to find the starting node of the cycle, we can start one pointer from the head and keep the other pointer at the meeting point. The main intuition is that the distance travelled by the pointer from head to the starting node of the cycle is equal to the distance travelled by the pointer from the meeting point to the starting node of the cycle (when both pointers meet again, it will be at the starting node of the cycle).
 * Finally, return either of the pointers as they will be at the starting node of the cycle. Further, the edge case of no cycle is handled by the flag variable.
 */
public class linkedListCycle_ii {
    public ListNode detectCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;

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

        if(!flag) return null;

        slow=head;
        while(fast!=slow)
        {
            slow=slow.next;
            fast=fast.next;
        }

        return fast;

        
    }
}