// In first approach, we are looping over the LL to find the length of the linked list. Then, for going to the previous node of the node
// that we want to remove, we are doing length-diff. Then again looping over LL till diff. That will correctly take us to the prev node.
// Then to remove the desire node, we just do prev.next=prev.next.next

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Optimal approach but two times we are looping over LL:
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Base Case
        if (head == null) {
            return null;
        }
        // Calculate length
        int len = 0;
        ListNode start = head;
        while (start != null) {
            len++;
            start = start.next;
        }
        // Calculate difference
        int diff = len - n;
        // Introduce a dummy node at start to handle a case where len==n, so to avoid
        // doing null.next
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // Start from dummy node go until diff
        ListNode prev = dummy;
        for (int i = 0; i < diff; i++) {
            prev = prev.next;
        }
        // Now prev is at correct position
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
        // Our head is dummy.next, so return that
        return dummy.next;
    }
}

// In second approach, we are keeping two pointers slow and fast. We will start
// moving fast pointer first and move it till we reach nth
// node. Then move both slow and fast till fast is null. Now slow will be at
// correct prev node. And then we do prev.next=prev.next.next. So it is a one go
// solution.

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Optimal approach and we looping only one time on LL (i.e. One go solution):
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Base Case
        if (head == null) {
            return null;
        }
        // Dummy node to handle n==length of ll
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // Two pointers start from dummy
        ListNode slow = dummy;
        ListNode fast = dummy;
        // Move only fast initially till the cnt<=n
        int cnt = 0;
        while (cnt <= n) {
            cnt++;
            fast = fast.next;
        }
        // Then move both till fast is null
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Slow will be at correct prev position
        slow.next = slow.next.next;
        // Head is dummy.next, so return that
        return dummy.next;
    }
}