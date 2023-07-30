// Time Complexity : O(n)
// Space Complexity : O(1) optimal
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Solution 1: Reverse linekd list using recursion
//Time: O(n) Space = O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) return head;

        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return result;
    }
}

//Solution 2: Time: O(n), Space = O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) return head;

        ListNode prev = null, curr = head;

        while(curr!=null){ 
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}