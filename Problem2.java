/*
Time Complexity -O(sz) which is nothing but O(N) number of nodes
Spcace COmplexity -> O(1)
*/

class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int counter =0;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(counter <= n) {
            counter++;
            fast = fast.next;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

}
/*
Time Complexity -O(sz) which is nothing but O(N) number of nodes
Spcace COmplexity -> O(1)
*/


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int counter = 0;
        ListNode temp = head;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        int diff = counter - n;
        temp = dummy;
        for (int i = 0; i < diff; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
}