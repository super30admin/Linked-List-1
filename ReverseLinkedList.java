// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

//Iterative
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;


        //maintain 3 pointers
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;

        //traverse making adjustments to pointers
        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }

        //last node's next is still not pointed tp prev.
        curr.next = prev;
        return curr;
    }
}

//recursive
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
