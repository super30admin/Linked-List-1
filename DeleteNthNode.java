/**
 * time complexity is O(n)
 * space coplexity is O(1)
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1, head);
        
        ListNode iter1 = dummy;
        int count = n;
        while(count >= 1 && iter1 != null) {
            iter1 = iter1.next;
            count--;
        }
        
        ListNode iter2 = dummy;
        while(iter1.next != null) {
            iter1 = iter1.next;
            iter2 = iter2.next;
        }

        iter2.next = iter2.next.next;
        return dummy.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}