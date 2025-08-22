// Time Complexity : O(n)
// Space Complexity : O(n) for the recursive call stack, O(1) for the iterative approach 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Using recursion we iterate the list in backwards direction, and reverse the links using stack calls. The re variable always contains the last node of the list because it is not a parameter of recursion. when its going backwards we set the next next to curr head and curr next to null.
//Using the iterative approach, prev and curr job is to hold the respective nodes, store curr next to temp and make curr next to prev.

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        //not a parameter of recursion
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reverse;
    }

    public ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        return prev;
    }

}
