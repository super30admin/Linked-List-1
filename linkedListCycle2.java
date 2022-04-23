/**
Problem: https://leetcode.com/problems/linked-list-cycle-ii/
TC: O(n)
SC: O(1)
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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode intersection = getIntersection(head);
        if (intersection == null) {
            return null;
        }
        return getStartNode(head, intersection);
    }
    
    private ListNode getStartNode(ListNode p1, ListNode p2) {
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    
    private ListNode getIntersection(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (fast == slow) {
                return slow;
            }
        }
        return null;
    }
}