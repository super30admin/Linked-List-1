/*
* Approach:
*  1. Maintain two pointers slow and head.
        move slow by one step
            fast by two steps
* 
*  2. When fast reaches last node or null, we can say cycles doesnt exists
        else, continue until fast and slow meets
* 
*  3. Once they meet, bring one of the pointers to initial point and
        move both pointers by one step.
    The point they meet again, that will be the starting point of the cycle.
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(1)
* 
*/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast==slow){
                // cycle found
                fast = head;

                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }

                return fast;
            }
        }

        return null;
    }
}
