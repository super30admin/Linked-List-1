public class LeetCode206 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        // we are going to solve it using three pointers:
        if (head == null || head.next == null)
            return head;// can reavese a empty list or a list with
        // single node hence answer will be head or same list only
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;

        while (fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }

        curr.next = prev;
        return curr;

    }
}

// tc--> O(n)
// sc--> O(1)
