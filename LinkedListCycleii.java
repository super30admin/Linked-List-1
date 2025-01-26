class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

// TC: O(n) as Fast pointer is traversed till last if cycle is absent. If not
// the slow and fast meets.
// SC: O(n) as ListNode is used and method returns the same.
public class LinkedListCycleii {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        ListNode result = detectCycle(head);
        print(result);
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (entry != slow) {
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }

    private static void print(ListNode root) {
        System.out.print(root.val);
    }

}
