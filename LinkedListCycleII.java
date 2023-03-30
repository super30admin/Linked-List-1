public class LinkedListCycleII {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
  //leetcode - 142
    //TC: O(N)
    //SC: O(1)
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
  //HashSet approach TC: O(N), SC: O(N)
    /*public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head != null) {
            if(set.contains(head)) return head;
            set.add(head);
            head = head.next;
        }
        return null;
    }*/
}
