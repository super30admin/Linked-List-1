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
    - we are using the concept that 
    - distance between start node to head of cycle =  distance between head of cycle to meeting point of fast and slow
    - thus, we first traverse the fast and list through the linked list
    - if they intersect, we break the loop
    - in another iteration we start from beginning of list and meeting point of list
    - the two pointers will intersect at head of list
    - TC: O(n)
    - SC: O(1)
    - works on leetcode
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast!= null && fast.next!=null)
        {
            fast=fast.next.next;
            slow = slow.next;
            if(slow == fast)
            {
                flag = true;
                break;
            }
        }

        if(!flag) return null;

        fast = head;
        while(slow!=fast)
        {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}