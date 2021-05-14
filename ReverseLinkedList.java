/*
Desc: while we push all the elements present in the linked list till the last but one element
we point the next pointer of the last element to the popped element and erase the current pointer of the
popped element.
Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode r = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return r;
    }
}
