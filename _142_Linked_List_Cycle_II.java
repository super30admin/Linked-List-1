/**** Method 1 ****/
//Time Complexity: O(n)
//Space Complexity: O(n)

//Successfully submitted in LeetCode

//As we need to find cycle node, it will the node which will be repeating as it is where the cycle start, we can add the node in HashSet and return when find the duplicate, else if the traversal reaches end.

/**** Method 2 ****/
//Time Complexity: O(n)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

//We take two pointers slow and fast,slow moves one step whereas fast moves two steps, if there is an cycle they will meet lese fast will reach end. If they meet then we take slow pointer to head and start moving both pointers until they meet as the pointer they meet is the start of the cycle.

import java.util.HashSet;

public class _142_Linked_List_Cycle_II {

  public ListNode detectCycle(ListNode head) {
    HashSet<ListNode> set = new HashSet<>();

    ListNode curr = head;

    while (curr != null) {
      if (set.contains(curr)) {
        return curr;
      } else {
        set.add(curr);
      }
      curr = curr.next;
    }
    return null;
  }

  public ListNode detectCycle1(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        break;
      }
    }

    if (fast != null && fast.next != null) {
      slow = head;
      while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
      }

      return slow;
    } else {
      return null;
    }
  }
}
