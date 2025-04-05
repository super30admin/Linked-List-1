
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
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow==fast){
                flag = true;
                break;
            }
        }
        slow = head;
        if(!flag){
            return null;
        }
        else{
            while(slow!=fast){
                slow = slow.next;
                fast=fast.next;
            }
        
        }
    return slow;
    }
}