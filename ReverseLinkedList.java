// Time Complexity : O(n) n is num of elements in linkedList
// Space Complexity : O(1) no aux data
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        return prev;
    }
}
