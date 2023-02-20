// TC: O(n)
// SC: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode temp, curr, newHead = null;
        curr = head;
        while(curr != null) {
            temp = curr.next;
            curr.next = newHead;
            newHead = curr;
            curr = temp;
        }
        return newHead;
    }
}