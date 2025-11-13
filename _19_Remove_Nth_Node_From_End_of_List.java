/**** Method 1 ****/
//Time Complexity: O(2*n)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

//As we need remove the nth node from last, we can count the size of the linked list and move the pointer to size - n, so that we get node which is before nth from last, we can alter the it's next to be next.next. But we have ensure the end cases like removing the head and removing when linked list size is one.

/**** Method 2 ****/
//Time Complexity: O(n)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

//Rather than using a count method we can use two pointers, slow and fast, slow will start after fast moves n nodes, by this way when fast reaches to end we slow's next will point to the node which has to be removed. But we have ensure the end cases like removing the head and removing when linked list size is one.

public class _19_Remove_Nth_Node_From_End_of_List {

  public ListNode removeNthFromEndWithCount(ListNode head, int n) {
    int count = 0;
    ListNode curr = head;
    while (curr != null) {
      count++;
      curr = curr.next;
    }

    if (count == 1) {
      return null;
    }
    //Removing the head
    if (count - n == 0) {
      head = head.next;
    } else {
      curr = head;
      while (count - n > 1) {
        curr = curr.next;
        count--;
      }
      if (curr.next != null) {
        curr.next = curr.next.next;
      } else {
        curr.next = null;
      }
    }

    return head;
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    //Removing the only node
    if (head.next == null) {
      return null;
    }
    ListNode next = head;

    for (int i = 0; i < n; i++) {
      next = next.next;
    }
    //Removing the head
    if (next == null) {
      return head.next;
    }
    ListNode curr = head;
    while (next != null && next.next != null) {
      curr = curr.next;
      next = next.next;
    }

    curr.next = curr.next.next;

    return head;
  }
}
