// Time Complexity : O(m + n) -> to Detect the start position of the cycle by going over the Linked List
//                   where m is the number of cycle rounds taken by fast ptr and n is the number of steps till it reaches start pos of cycle
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Reference to Floyd Algorithm
/* Your code here along with comments explaining your approach: Move the fast and the slow pointer. Move the fast by 2 steps and slow by a step.
There would be exactly a point when slow would meet fast if the cycle exists. To detect the start position of that point, move slow to the start of
the linked list. Then till fast and slow becomes equal, move them by one step and as they meet, the start position is detected. If fast never
meets slow => no cycle. This is Floyd's algorithm. Its mathematically proven that the Floyd's algorithm works.
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int pos = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && slow!=null && slow.next!=null && fast.next!=null){
            fast = fast.next.next;                                                  // Move fast by two steps
            slow = slow.next;                                                           // Move slow by a step
            if(fast == slow){                           // Cycle exists
                slow = head;                                         // Slow moves to the start of the Linked List
                head = cycleBegins(slow, fast);                     // Detect the position
                return head;
            }
        }
        return null;
    }
    private ListNode cycleBegins(ListNode slow, ListNode fast){
        while(slow != fast){                                        // Move both the pointers by one step till they meet again and that position is the start pos
            slow = slow.next;
            fast= fast.next;
        }
        return fast;                                            // Start position of the cycle
    }
}