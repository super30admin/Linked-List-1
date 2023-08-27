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
        ListNode fast = head;
        ListNode slow= head;
        boolean y=false;
        while(fast!=null && fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast = fast.next.next;

            if(slow==fast && fast.next!=null)
            {
                y=true;
                break;
            }
        }
        if(y==true)
        {
            System.out.println("here");
            fast=head;
            while(fast!=slow)
            {
                fast=fast.next;
                slow=slow.next;
            }
            return fast;
        }
        return null;
    }
}