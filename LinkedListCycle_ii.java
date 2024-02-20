//Time Complexity = O(n)
//Space Complexity = O(1)
//Does it run on LeetCode successfully? : Yes
//Any difficulties: On both while loop condition. Variable names have to appropriate to avoid confusion.

/*
It is two pointers approach.
Move slow pointer by 1 and fast by 2 by placing them initially on head. If they meet, then there is cycle.
Then reset only fast pointer to head and then increment both fast and slow by 1 until they meet.

This is the node on which there is a cycle.
*/

public class LinkedListCycle_ii {
    class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null)
            return null; //either no cycle or no linkedlist

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        while(fast != null && fast.next != null){ //odd and even length list
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle)
            return null; // there is no cycle

        fast = head;
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args){
        LinkedListCycle_ii listcycle = new LinkedListCycle_ii();
        ListNode head = listcycle.new ListNode(1);
        System.out.println("Head node's object reference : " + head);
        System.out.println("Head node : " + Integer.toString(head.val));

        //Adding more nodes to LinkedList here
        head.next = listcycle.new ListNode(-2);
        head.next.next = listcycle.new ListNode(4);
        head.next.next.next = listcycle.new ListNode(6);
        head.next.next.next.next = listcycle.new ListNode(3);

        //creating cycle

        head.next.next.next.next = head.next.next;

//        1->-2->4->6->3
//               |     |
//                ----
//        head = null;
        System.out.println("Node which of which cycle starts : " + listcycle.detectCycle(head));
        if(listcycle.detectCycle(head) != null)
            System.out.println("Node which of which cycle starts : " + listcycle.detectCycle(head).val);

    }
}