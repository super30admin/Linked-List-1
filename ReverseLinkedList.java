/**
 * time complexity is O(n)
 * space coplexity is O(1)
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode iter = head;
        
        while(iter.next != null) {
            iter = iter.next;
        }
        
        ListNode tail = iter;
        
        ListNode dummy = new ListNode(-1, head);
        
        while(dummy.next != tail) {
            ListNode node = dummy.next;
            dummy.next = node.next;
            
            node.next = tail.next;
            tail.next = node;
        }
        
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