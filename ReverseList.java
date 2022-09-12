// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We initialize three nodes prev, curr and fast
// we point the curr.next to null(prev) this sets the first node to be last node 
// The new prev will become current
// the new current will become fast
// fast moves to the next node in the list
// So, next iteration the current node will point to previous node which will make the list go in reverse


// Your code here along with comments explaining your approach
public class ReverseList {
    public static void main(String args[]) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(6);
        ListNode reverseHead = reverseList(head);
        while(reverseHead != null) {
            System.out.println(reverseHead.val);
            reverseHead = reverseHead.next;
        }

    }
public static ListNode reverseList(ListNode head) {
        
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        while(fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
            
        }
        curr.next = prev;
        
        return curr;
        
    }
}
public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}