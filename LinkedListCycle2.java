//Time Complexity: O(n)
//Space Complexity: O(1)

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
        if(head==null)
            return null;
        do{
            if(fast.next==null || fast.next.next == null)
                return null;
            fast = fast.next.next;
            slow = slow.next;
        }while(slow!=fast);
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}