/**
 * Time Complexity: O(n)
 * Space Compleixty: O(1)
 */


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode current = head;
        while(current != null) {
            count = count + 1;
            current = current.next;
        }

        if(count - n == 0)
            return head.next;
        int traverse = count - n;
        current = head;
        int i = 1;
        while( i < traverse) {
            current = current.next;
            i++;
        }

        current.next = current.next.next;

        return head;

    }
}
