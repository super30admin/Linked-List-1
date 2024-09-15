// TC: O(n)
// SC: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode first, second, third;
        third = null;
        second = null;
        first = head;
        while(first != null) {
            third = second;
            second = first;
            first = first.next;
            second.next = third;
        }
        return second;
    }
}