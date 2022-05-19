/*
Time: O(n) linear scan
Space: O(1)
*/
package LINKED;

public class Reverse{
    protected static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null, curr = head;

        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}