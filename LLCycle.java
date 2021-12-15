public class LLCycle {

      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public ListNode detectCycle(ListNode head) {
        /*

        TC: O(n)
        SC: O(1)

        */
        if(head==null || head.next==null) return null;

        ListNode slow=head;
        ListNode fast=head;
        boolean hasCycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                hasCycle=true;
                break;
            }
        }
        if(!hasCycle){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }
}
