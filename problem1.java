// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// The algorithm uses three pointers (prev_p, current_p, and next_p)
// to traverse the list and modify the pointers to reverse the direction of the links.
public class problem1 {
    public ListNode reverseList(ListNode head) {
        // step 1
        // prev_p to keep track of the previous node, current_p to keep track of the current node, and next_p to store the next node temporarily.
        ListNode prev_p = null;
        ListNode current_p = head;
        ListNode next_p;

        // step 2
        //  Inside the loop, we store the next node in the next_p variable, then change the next pointer of the current node to point to the previous node (prev_p). After that, we move the prev_p and current_p pointers one step forward in the list.
        while(current_p != null) {
            next_p = current_p.next;
            current_p.next = prev_p;
            prev_p = current_p;
            current_p = next_p;
        }

        head = prev_p; // step 3
        // we update the head to be the last node
        return head;
    }
}
