// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :N/A

// Your code here along with comments explaining your approach
// Used slow and fast pointers to create a gap of 'n' nodes among them
// When fast or fast.next reaches null that means slow has reached its desired position which n+1 element from end
// Then connect that n+1 element to n-1 th element
// That's how nth element is removed

class removeNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        while (n > 0) {
            fast = fast.next;
            n--;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;

        return head;

    }
}