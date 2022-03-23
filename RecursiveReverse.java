/**
 * time complexity is O(n)
 * space coplexity is O(n) - if recursive stack is considered or else O(1)
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode reverseHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseHead;
    }

    class ListNode
    {
        int data ;
        ListNode next;
        ListNode(int d)
        {
            data = d;
            next = null;
        }
    }
}