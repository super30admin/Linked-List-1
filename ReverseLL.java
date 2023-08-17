// https://leetcode.com/problems/reverse-linked-list/description/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

package S30_Codes.Linked_List_1;

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = cur.next;

        while(next != null){
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }

        cur.next = prev;
        return cur;
    }
}


 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
