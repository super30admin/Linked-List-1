// 2 pointers, single pass - O(n)
//First move the fast pointer n + 1 steps ahead so it leads the slow by n nodes.
//Then move both together until fast hits the end — now slow is right before the target.
//Finally, skip the node to be removed and clean up the reference.
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while (count <= n){
            fast = fast.next;
            count++;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        return dummy.next;
    }
}