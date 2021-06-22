package LinkedList1;


/*Time complexity : o(n) 
  space complexity: o(1) 
  Did this code run successfully in leetcode : yes
  problems faces : No.
*/
public class LinkedListCycle2 {

public ListNode detectCycle(ListNode head) {

    ListNode slow = head;
    ListNode fast = head;
    boolean isCycle = false;

    while (fast != null && fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;
                if(slow == fast)
                {
                    isCycle = true;
                    break;
                }
    }

    if(!isCycle) return null;


        fast = head;
        while (slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }


    return slow;

    }

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

}