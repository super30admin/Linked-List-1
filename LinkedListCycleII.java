/*

Thought Process -> Use Floyd's Algo concept of hare and tortoise.

Initially we check for cycle? Move tortoise 1 position and hare 2 positions. When they intersect we conclude there will be a cycle.
Next mark the tort again to the head and move both hare and tortoise 1 positions each. The point where they meet is the point where the cycle starts

T.C -> 2 Pass O(N)
S.C -> O(1)


*/

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
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode tort = head, hare = head;
        Boolean hasCycle = false;
        while(hare != null && hare.next != null){
            tort = tort.next;
            hare = hare.next.next;
            if(tort == hare){
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle) return null;
        tort = head;
        while(tort!=hare){
            tort = tort.next;
            hare = hare.next;
        }
        return hare;
    }
}