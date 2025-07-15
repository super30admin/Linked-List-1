// Time Complexity : O(n) -> iterating over entire linkedlist
// Space Complexity : O(1) -> Just pointers and dummy node, no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //basecase
        if(head == null){
            return head;
        }

        //dummy
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slowPtr = dummy;
        ListNode fastPtr = dummy;

        //set fast to the nth node from the head of the linkedlist
        int count = 0;
        while(count <= n){
            count ++;
            fastPtr = fastPtr.next;
        }

        //we want to move both pointers until the fast reaches null
        while(fastPtr != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        //update slow
        slowPtr.next = slowPtr.next.next;

        //dummy's next is where our head is now
        return dummy.next;

    }
}