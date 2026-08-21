// finding the head of a cycle in linked list
// O(n) time complexity
//O(1) space complexity
// first find the cycle using fast and slow pointer since fast pointer catches the slow pointer and as distance of meeting point from head oof cycle is same as distance from start of linked list , iterating to find head.

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

        ListNode slow = head;

        ListNode fast = head;

        boolean flag = false ;

        ListNode temp;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
               flag = true;
               break;
            }
        }



        if(!flag){ return null;}

        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast= fast.next;
            if(slow == fast) {
              break;
            }
        }
        
        return slow;
    }
}
