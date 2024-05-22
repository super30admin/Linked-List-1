// Time Complexity: O(number of nodes)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class ReverseLinkedList {
    // Time Complexity: O(number of nodes)
    // Space Complexity: O(1)
    public ListNode reverseList(ListNode head) {
        // null check
        if(head == null){
            return null;
        }
        // check for only one node
        if(head.next == null){
            return head;
        }
        ListNode temp = head.next;
        head.next = null;
        return helper(temp, head);

    }

    private ListNode helper(ListNode curr, ListNode prev) {
        // when you find null that means linkedList has been traversed and we are at the very end.
        if(curr == null){
            return prev;
        }
        // keep a track of nextNode
        ListNode next = curr.next;
        // reverse
        curr.next = prev;
        // reverse it resursiverly
        return helper(next, curr);
    }
}