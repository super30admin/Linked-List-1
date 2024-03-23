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

 // tc = o(n)
 // sc = o(1)
class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){ //should be and not or
            slow = slow.next; 
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }

        if(flag == false)return null;

        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}