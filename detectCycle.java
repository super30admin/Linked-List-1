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
/* 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //Tc: O(n) Sc: O(1)
       ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
               
                break;
            }
        }

        if (fast == null || fast.next == null) {
           
            return null;
        }

        fast = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}

*/