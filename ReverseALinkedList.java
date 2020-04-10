// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ReverseALinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
