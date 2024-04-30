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
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //Move slow by 1
            fast = fast.next.next; //Move fast by 2
            if(fast == slow){ //Both slow and fats are equal if cyclic
                flag = true;
                break;
            }
        }
        if(flag){
            slow = head;
            while(fast != slow){ //Returns the head of the cycle
                slow = slow.next; //Move slow by 1
                fast = fast.next; //Move fast by 1
            }
        }
        else{
            return null;  // > a > b > c > b is cyclic and a = c
        }
        return slow;
    }
}