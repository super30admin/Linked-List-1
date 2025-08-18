// Time Complexity : O(n) — visit each node once
// Space Complexity : O(1) — in-place reversal
// Did this code successfully run on LeetCode : Yes

// approach:
// 1) Use three pointers: prev, curr, next.
// 2) Iterate: store curr.next in next, set curr.next = prev, shift prev=curr, curr=next.
// 3) At the end, prev is the new head.


public class RevereseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
