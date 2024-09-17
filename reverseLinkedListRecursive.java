// simple recursive solution for reversing linked list
// TC 0(N) SC(1) 
// here were will be manipulating head poinnter, while reverse pointer stays at end of list ( beginniing of LL)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
}