class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        // TC:O(n)
        // SC:O(1)
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){ // odd && even numbers
            slow = slow.next; //1x
            fast= fast.next.next; //2x
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast; // slow will also work
    }
}
