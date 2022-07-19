////Time complexity:O(n)
//Space Complexity:O(1)
//Oracle Interview
//For detecting the cycle in linked list we will be using 2 pointers ; where one will move with twice the velocity of second then whenever they meet from that point we will make one head pointer and the pointer at that clashed location to take one step simultaneously ; the moment they will be at the same node that is going to be the starting point of cycle in linked list.
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
       ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                while (head != slow) {
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    
}