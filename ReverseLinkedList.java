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

// TC: For Recursion: O(n), For 3 pointers: O(n)
// SC: For Recursion: O(1), For 3 pointers: O(1)

// Two approaches are coded. Recursion and Using 3 pointers
public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        print(head);
        ListNode result = reverseListUsingRecursion(head);
        print(result);
        System.out.println();
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        print(head1);
        ListNode result1 = reverseListUsingPointers(head1);
        print(result1);
    }

    // Recursion, elements are pushed until length - 1 elements. The last element
    // points to the popped element from recursion stack after returning.
    private static ListNode reverseListUsingRecursion(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode current = reverseListUsingRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return current;
    }

    // Three pointers, Prev(slow), current and fast has been utilized here.
    private static ListNode reverseListUsingPointers(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = null;
        ListNode curr = head;
        ListNode fast = head.next;
        while (fast != null) {
            curr.next = slow;
            slow = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = slow;
        return curr;
    }

    private static void print(ListNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.next;
        }
        System.out.println();
    }

}