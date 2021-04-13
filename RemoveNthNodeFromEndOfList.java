/*

Thought Process: We need 2 pointers with differnce between them as n viz, slow and fast
If we initialize the pointers to a dummy pointer before head and move only the fast pointer n steps.
Then in next round when we move both slow and fast till fast reaches null, we get the slow pointer at a location whose next Node we have to remove.

T.C -> O(N)
S.C -> O(1)

*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode slow = start, fast = start;
        int count = 0;
        while(count <=n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        //Mistake -> slow = slow.next.next
        slow.next = slow.next.next;
        //Mistake -> Returning head
        return start.next;
    }
}