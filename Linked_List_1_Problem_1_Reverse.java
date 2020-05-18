//Time COmplexity : O(n)
//Space Complexity : O(1)
//Run Successfully on leetcode
//No problem


public class Linked_List_1_Problem_1_Reverse {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null){
            slow.next = temp;
            temp = slow;
            slow = fast;
            fast = fast.next;
        }
        slow.next = temp;
        return slow;

    }

    ListNode p;
    public ListNode reverseListrecursive(ListNode head) {
        if(head == null) return null;
        helper(head);
        return p;
    }
    public void helper(ListNode head)
    {
        if(head.next == null)
        {
            p = head;
            return;
        }
        helper(head.next);
        head.next.next = head;
        head.next = null;
    }

}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }