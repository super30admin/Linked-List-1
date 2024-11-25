// Time Complexity :O(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nothing

public class ReverseLinkedList {
      public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
       if(head == null){
           return null;
       }

       ListNode prev = null;
       ListNode curr = head;

       while(curr != null){
           ListNode temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;
       }

       return prev;
    }
}
