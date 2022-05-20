class RemoveNthNode {

  // Time O(N)
  // Space O(1)
  // Did this code successfully run on Leetcode : Yes
  // Any problem you faced while coding this :
  // Structure of node
  static class ListNode {
    int data;
    ListNode next;
  };

  // Function to insert node in a linked list
  static ListNode insert(ListNode head, int x) {
    ListNode temp, ptr = head;
    temp = new ListNode();
    temp.data = x;
    temp.next = null;
    if (head == null)
      head = temp;
    else {
      while (ptr.next != null) {
        ptr = ptr.next;
      }
      ptr.next = temp;
    }
    return head;
  }

  // Function to remove nth node from last
  static ListNode removeNthFromEnd(ListNode head, int B) {
    // To store length of the linked list
    int len = 0;
    ListNode tmp = head;
    while (tmp != null) {
      len++;
      tmp = tmp.next;
    }

    // B > length, then we can't remove node
    if (B > len) {
      System.out.print("Length of the linked list is " + len);
      System.out.print(" we can't remove " + B +
          "th node from the");
      System.out.print(" linked list\n");
      return head;
    }

    // We need to remove head node
    else if (B == len) {

      // Return head.next
      return head.next;

    } else {
      // Remove len - B th node from starting
      int diff = len - B;
      ListNode prev = null;
      ListNode curr = head;
      for (int i = 0; i < diff; i++) {
        prev = curr;
        curr = curr.next;
      }
      prev.next = curr.next;
      return head;
    }

  }

  // This function prints contents of linked
  // list starting from the given node
  static void display(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // LC-input1
    ListNode head1 = null;

    head1 = insert(head1, 1);
    head1 = insert(head1, 2);
    head1 = insert(head1, 3);
    head1 = insert(head1, 4);
    head1 = insert(head1, 5);

    int n1 = 2;

    System.out.print("Linked list before modification: \n");
    display(head1);

    head1 = removeNthFromEnd(head1, 2);
    System.out.print("Linked list after modification: \n");
    display(head1);
    // LC-input2
    ListNode head2 = null;

    head2 = insert(head2, 1);
    head2 = insert(head2, 2);

    int n2 = 1;

    System.out.print("Linked list before modification: \n");
    display(head2);

    head2 = removeNthFromEnd(head2, 1);
    System.out.print("Linked list after modification: \n");
    display(head2);

    // LC-input1

    ListNode head3 = null;

    head3 = insert(head3, 1);

    int n3 = 2;

    System.out.print("Linked list before modification: \n");
    display(head3);

    head3 = removeNthFromEnd(head3, 1);
    System.out.print("Linked list after modification: \n");
    display(head3);
  }
}
