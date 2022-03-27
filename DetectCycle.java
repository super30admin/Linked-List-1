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
 time complexity = O(n)
 space Complexity = O(1)
 
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                flag = true;
                break;
            }            
        }
        if(flag == false)
            return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
