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
Floyd’s loop detection algorithm
1. If a loop is found, initialize slow pointer to head, let fast pointer be at its position.
2. Move both slow and fast pointers one node at a time.
3. The point at which they meet is the start of the loop.
*/
//Time Complexity : O(N)
//Space Complexity : O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode nullnode = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow!=fast){
                    slow=slow.next;
                    fast =fast.next;
                }
                return slow;
            }

        }
        return nullnode;

    }
}