// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

/*

    we use Floyd's cycle detection algorithm. 
    We move fast by two steps and slow by one step. 
    If slow == fast, we then break the loop and find out head of common point
    by moving one pointer back to the head and iterating till we come to a common point.


*/

public class LinkedListCycleII {
    
    public static ListNode detectCycle(ListNode head)
    {
        if(head==null) return null;

        ListNode slow = head,fast = head;

        boolean hasCycle = false;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;


            if(slow==fast)
            {
                hasCycle=true;
                break;
            }
        }

        if(hasCycle==false)
        {
            return null;
        }

        slow = head;

        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }

        return fast;
    }

}
