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

    }

  }
