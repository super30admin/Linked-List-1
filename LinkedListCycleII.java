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
public class Solution {
    /**

        Use Floyd's Algo concept of hare and tortoise
        Initially we check for cycle? Move tortoise 1 position and hare 2 positions. When they
        intersect we conclude there will be a cycle.
        Next mark the tort again to the head and move both hare and tortoise 1 positions each.
        The point where they meet is the point where the cycle starts

        T.C -> 2 Pass O(N)
        S.C -> O(1)
     */
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break; // Cycle detected
        }

        // No cycle detected. Could also have been done using a boolean flag to detect cycle
        if(fast == null || fast.next == null) return null;

        // Cycle detected
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        
    }
}
