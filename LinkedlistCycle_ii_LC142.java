// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : no, used Floyd’s Cycle Detection Algorithm (also known as the Tortoise and Hare algorithm)


public class LinkedlistCycle_ii_LC142 {

    public static void main(String[] args) {
        ListNode head = createCyclicList();
        ListNode entry = detectCycle(head);
        System.out.println("entry: "+ entry);
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }

        }

        return null;
    }

    public static ListNode createCyclicList() {
        // Step 1: Create all nodes
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        ListNode node5 = new ListNode(1);

        // Step 2: Link nodes normally
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Step 3: Create the cycle (pos = 1 => node2)
        node5.next = node2;

        // Return the head of the list
        return node1;
    }

}

class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
      public String toString(){
          return "ListNode: " + val;
      }
  }