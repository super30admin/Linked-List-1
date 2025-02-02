// Approach 1: Iterative
// TC: O(n)
// SC: O(1)

// Approach 2: Recursive
// TC: O(n)
// SC: O(n) due to recursive stack


// Approach 1: Iterative
public class LC206 {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode x = null, y = head, z = head.next;
        while (y != null) {
            y.next = x;
            x = y;
            y = z;
            if (z != null)
                z = z.next;
        }
        return x;
    }
}


// Approach 2: Recursive
class LC206_1 {
    ListNode ans = null;

    private ListNode reverse(ListNode head) {
        if (head.next == null) {
            ans = head;
            return head;
        }
        reverse(head.next).next = head;
        return head;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null)
            return ans;
        reverse(head).next = null;
        return ans;
    }
}