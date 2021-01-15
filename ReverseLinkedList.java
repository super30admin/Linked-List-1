// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class ReverseLinkedList {

  public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

  public static void main(String[] args){
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    System.out.println("\n========= Recursive start ========");
    ListNode temp = head;

    while(temp != null){
      System.out.print(temp.val + "->");
      temp = temp.next;
    }
    ListNode prev = reverseRecursive(head);

    temp = prev;
    System.out.print("\n");

    while(temp != null){
      System.out.print(temp.val + "->");
      temp = temp.next;
    }


    head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    reverseIterative(head);

  }

  // Time Complexity : O(n)
  // Space Complexity : O(n) - recursive space
  // Did this code successfully run on Leetcode : yes
  // Any problem you faced while coding this : no
  public static ListNode reverseRecursive(ListNode head){
    if(head == null || head.next == null) return head;

    ListNode reversed = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;

    return reversed;
  }



    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this : no
    public static void reverseIterative(ListNode head){

      System.out.println("\n========= iterative start ========");
      ListNode temp = head;
      while(temp != null){
        System.out.print(temp.val + "->");
        temp = temp.next;
      }

      ListNode prev = null;
      ListNode curr = head;

      while (curr != null) {
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
      }

      temp = prev;
      System.out.print("\n");
      while(temp != null){
        System.out.print(temp.val + "->");
        temp = temp.next;
      }
      System.out.print("\n");
    }
  }
