TC: O(n)
SC: O(1)

Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
Memory Usage: 36.9 MB, less than 98.92% of Java online submissions for Reverse Linked List.
Next challenges:

Problemsfaced: understanding that from second last node only we are making direction reversal

class Solution {
    public ListNode reverseList(ListNode head) {
       // head == null is for base case when input is []
        if( head == null || head.next == null) return head;
        ListNode rev = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;
        return rev;
        
    }
}
