//Leetcode - 19
//TC - O(N)
//SC - O(1)
public class RemoveNthNodeFromEnd {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count=0;
        while(count<=n) {
            fast = fast.next;
            count++;
        }
        while(fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
