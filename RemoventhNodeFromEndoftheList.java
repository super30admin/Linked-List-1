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
// TC: O(n) In the first approach, gap is created and right pointer is traversed
// till last node.
// Length is calculated in the second approach which traverses all the nodes.

// SC: O(1) Extra ListNodes are used but methods are expected to return
// ListNode.
public class RemoventhNodeFromEndoftheList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        print(head);
        ListNode result = removeNthFromEndCreatingGap(head, 2);
        print(result);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        print(head1);
        ListNode result1 = removeNthFromEndCalculatingLength(head1, 2);
        print(result1);
    }

    // creating a gap prior to moving slow pointer
    public static ListNode removeNthFromEndCreatingGap(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    // calculating length and subtracting n and hence moving left.
    private static ListNode removeNthFromEndCalculatingLength(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode right = head;
        ListNode left = dummy;
        int length = 0;
        while (right != null) {
            right = right.next;
            length++;
        }
        int difference = length - n;
        while (difference > 0) {
            left = left.next;
            difference--;
        }
        left.next = left.next.next;
        return dummy.next;
    }

    private static void print(ListNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.next;
        }
        System.out.println();
    }
}
