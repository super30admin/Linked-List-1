// Time Complexity: O(n)
// Space complexity: O(1)

public class LinkedListCycle {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
         next = null;
      }
  }
    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while(p!=null && q!=null && q.next!=null){
            p = p.next;
            q = q.next.next;
            if(p==q)
                return findStart(p, head);
        }
        return null;
    }

    public ListNode findStart(ListNode p, ListNode head){
        ListNode q = head;
        while(p!=q){
            p = p.next;
            q = q.next;
            if(p==q)
                return p;
        }
        return p;

    }
}
