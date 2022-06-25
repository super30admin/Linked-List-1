// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class ListNode {
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

class Main {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // count for getting fast pointer at nth node from starting
        int count = 0;
        // if we want to delete first element so to preserve head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // fast pointer slow pointer technique
        ListNode slow = dummy;
        ListNode fast = dummy;
        // fast pointer till nth node from starting
        while (count <= n) {
            fast = fast.next;
            count++;
        }
        // now travel slow pointer and fast pointer till fast pointer becomes null
        // so we can find our removing element index at next to slow pointer
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // remove desired element
        slow.next = slow.next.next;
        // return head of the list
        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        ListNode result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.print("null");

    }

}