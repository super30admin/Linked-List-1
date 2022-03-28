/*
 Time Complexity : O(n)
 Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No


// Your code here along with comments explaining your approach :



*/

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

public class reverse_Linkedlist {

    public ListNode reverseList(ListNode head) {
        // creating prev for changing the pointer
        ListNode prev = null;

        // terminating condition.

        while (head != null) {
            // storing next pointer reference.

            ListNode next = head.next;
            // changing link of head to prev

            head.next = prev;
            // giving direction of prev to head.

            prev = head;
            // assign next pointer to head.
            head = next;
        }

        return prev;
    }
}
