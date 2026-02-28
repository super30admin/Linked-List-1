public class ReverseList {

    // Time Complexity : O(n)
    // Space Complexity : O(h)
    // Did this code successfully run on Leetcode : yes
    public ListNode reverseList(ListNode head) {
        return helper(head);
    }
    public ListNode helper(ListNode root) {
        if (root == null ||  root.next == null) return root;

        ListNode head = helper(root.next);
        root.next.next = root;
        root.next = null;

        return head;

    }
}