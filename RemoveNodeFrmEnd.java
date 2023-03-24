/*
  * Time Complexity - O(n) where n is the size of the linkedlist head.
  * Space Complexity - O(1)
  */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n <= 0 || head == null)
            return null;

        ListNode newHead = new ListNode(0, head);
        ListNode fast = head, slow = newHead;
        
        while(n-- > 0)
            fast = fast.next;
        //at time point diff between fast and slow is (n + 1).
        //when fast = null at the end of list, slow points to prev ele of nth node.
        //if slow is set to head, then slow would point to nth node itself.
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return newHead.next;
    }
}
