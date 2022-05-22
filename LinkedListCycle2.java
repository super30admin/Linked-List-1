//Time Complexity: O(n)
//Time Complexity: O(1)


public class LinkedListCycle2 {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode detectCycle(ListNode head) {

        //null Case
        if(head == null){
            return null;
        }

        ListNode slow=head;
        ListNode fast=head;
        boolean flag = false;

        while(fast != null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;

            }
        }

        if(!flag){
            return null;
        }
        slow = head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

}
