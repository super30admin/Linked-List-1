public class ReverseListRecursive {
    // TC O(N)
    // SC O(N)
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return helper(head);
    }

    private ListNode helper(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversed = helper(head.next);
        // stk.pop() happens
        // head is coming out of stack
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}
