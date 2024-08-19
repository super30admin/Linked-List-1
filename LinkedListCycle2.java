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

 // Logic-
// let's take the distance covered by slow to reach the start of the cycle be a 
// the distance covered by the fast pointer is a+b (b is the addl length from start of the cycle to end of the list)
// The distance c is the distance that fast pointer takes from end of the linked list to start of the cycle .
// if the cycle exists, a=b+c.
// iterative solution.
// time complexity = O(n)
// Space complexity = O(1)

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        boolean flag = false;// detect whether cycle exists.
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null ) {
            slow = slow.next;
            fast=fast.next.next;
            if(slow== fast) {
                flag = true;
                break;
            }
        }
        if(flag) {// cycle exists
            slow = head;
            while(slow!=fast) {
                slow=slow.next;
                fast= fast.next;
            }
        } else {
            return null;
        }
        return slow;
        
    }
}