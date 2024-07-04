/**
    L.C: 19. Remove Nth Node From End of List

    Approach: 2 pointers slow and fast

    Working:
        declare a dummy node and its next to head//to handel edge case if the n th node form the last is o
        declare 2 pointers
            slow -> dummy
            fast -> dummy
        declare count = 0// which holds the number of nodes traversed count
        iterate through the Linke dlist with fast pointer till count <= n
            assign fast to fast.next
            increment count

        iterate through the LL with fast pointer until it reaches null
            assign slow to its next and same follows to fast
        now the slow points to the node before the nth node to be removed
        assign slow.next = slow.next.next //assigning the next address val of the nth node to be removed

        return dummy.next //which is the start the LL

    Time Complexity: O(n)
    Space Complexity: O(1)

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
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;

        while(count<=n) {
            fast = fast.next;
            count++;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}