// Time Complexity : O(n)
// Space Complexity : O(n) uses stack n in recursion
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
public class ReverseLL {
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
        if (head == null || head.next == null)
            return head;
        // reverse inserts all elements except last, which will be assigned to reversed.
        ListNode reversed = reverseList(head.next); // st.pop() returns the value and is assigned to head
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}