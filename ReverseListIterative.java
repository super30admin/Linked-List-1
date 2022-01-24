public class ReverseListIterative {
    // TC O(N)
    // SC O(1)
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
        ListNode curr = head;
        ListNode fast = head.next;
        ListNode prev = null;
        while (fast != null) {
            curr.next = prev; // job of prev is done
            prev = curr; // job of curr is done
            curr = fast; // job of fast is done
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}
