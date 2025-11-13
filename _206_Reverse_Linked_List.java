/**** Method 1 ****/
//Time Complexity: O(n)
//Space Complexity: O(n)

//Successfully submitted in LeetCode

//Store all values of in a list and reverse and create a new linked list with values in in list.

/**** Method 2 ****/
//Time Complexity: O(n)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

// We could use prev pointer to point out the current node's next, while doing this we store current's node next as we don't want to lose it. It is like same like reversing an array using a temp variable but with nodes here.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _206_Reverse_Linked_List {

  /**** Method 1 ****/
  public ListNode reverseListIterative(ListNode head) {
    if (head == null) return null;
    List<Integer> list = new ArrayList<>();

    ListNode curr = head;

    while (curr != null) {
      list.add(curr.val);
      curr = curr.next;
    }

    Collections.reverse(list);

    ListNode newHead = new ListNode((int) list.get(0));

    curr = newHead;

    for (int i = 1; i < list.size(); i++) {
      ListNode node = new ListNode((int) list.get(i));
      curr.next = node;
      curr = curr.next;
    }

    return newHead;
  }

  /**** Method 2 ****/
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;

    ListNode curr = head;

    while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }
}
