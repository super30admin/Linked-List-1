
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev=null;
        ListNode next = null;

        if(head == null || head.next == null) return head;

        while(current !=null)
        {
            next = current.next;
            current.next = prev;
            prev= current;
            current = next;
        }
        return prev;
    }
}