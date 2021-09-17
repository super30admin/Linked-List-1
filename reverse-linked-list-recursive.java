//Time complexity : O(n)
//Space complexity : O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        //update the head.next.next pointer with the head
        head.next.next = head;
        //head.next will remove the pointer (ex: remove pointer from 3->4)
        head.next = null;
        return node;
    }
}