// Time Complexity : O(n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : We need to find if there's a cycle by moving slow by 1 and fast by 2 and if they meet , cycle is present. The distance from head to the cycle
// start point will be equal to the distance from cycle start point to fast. So we start one pointer from head and move ahead and when they both meet, it's the
// starting point of cycle.


public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next; //move slow by 1
            fast = fast.next.next; //move fast by 2

            if(slow == fast){ //cycle is present
                flag = true;
                break;
            }
        }

        if(!flag) return null; // no cycle

        slow = head;
        while(slow != fast){ //while both wont meet, move both
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // or fast, both give the result
    }
}