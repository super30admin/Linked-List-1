// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
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

public class LLDetectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        while(fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;


            //if slow equals fast, the loop is found
            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle) return null;

        // when slow meets fast, slow would have travelled 2(a+b), fast would have travelled a+b+c+a, which means a=c
        // where a - distance from the head to start of the loop,
        // b is the distance from the start of the loop to where both the pointers meet,
        // and c is the distance from where the pointers meet to the start of the loop
        // so move slow to head and it travels 'a' distance, fast to travel distance 'c' to meet each other at the start of the loop
        slow = head;

        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
