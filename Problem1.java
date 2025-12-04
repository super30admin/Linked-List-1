// Time Complexity : O(N) where N is the total number of ListNodes
// Space Complexity : O(N) N is the recursive stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
I traversed till the very end of the list. Once i am at the last node I will store the node at reversedHead.
After returning, I will make the head.next.next = head and head.next = null. Else a cycle will be formed
 */


public class Problem1 {
    ListNode reversedHead;
    public ListNode reverseList(ListNode head) {
        helper(head);
        return reversedHead;
    }

    private void helper(ListNode head) {
        if(head == null || head.next == null) {
            reversedHead = head;
            return;
        }

        helper(head.next);
        head.next.next = head;
        head.next = null;
    }
}
