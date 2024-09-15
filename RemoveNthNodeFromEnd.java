// TC: O(n)
// SC: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new Listnode(0, head);
        Listnode slow, fast;
        slow = dummy;
        fast = dummy;
        int count = 0;
        while(count <= n) {
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