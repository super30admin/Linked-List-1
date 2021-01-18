
import java.util.*;

public class RemoveNthNodefromEnd {

  public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


 // Time Complexity : O(n)
 // Space Complexity : O(n) - recursive space
 // Did this code successfully run on Leetcode : yes
 // Any problem you faced while coding this : no

  public static void main(String[] args){
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    // head.next.next = new ListNode(3);
    // head.next.next.next = new ListNode(4);
    // head.next.next.next.next = new ListNode(5);
    // head.next.next.next.next.next = new ListNode(6);
    // head.next.next.next.next.next.next = new ListNode(7);

    ListNode temp = head;

    removeNthFromEndUsingReverse(temp,1);

    // while(temp != null){
    //   System.out.print(temp.val + "->");
    //   temp = temp.next;
    // }
    //
    // ListNode dummy = new ListNode(-1);
    // dummy.next = head;
    //
    // ListNode slow = dummy;
    // ListNode fast = dummy;
    //
    // int n = 2;
    // int count = 0;
    // while(count <= n){
    //   slow = slow.next;
    //   count++;
    // }
    //
    // while(fast != null){
    //   slow = slow.next;
    //   fast = fast.next.next;
    // }
    //
    // slow.next = slow.next.next;
    //
    // System.out.print("\n");
    // temp = dummy.next;
    // while(temp != null){
    //   System.out.print(temp.val + "->");
    //   temp = temp.next;
    // }
    // System.out.print("\n");
  }

  // Time Complexity : O(n)
  // Space Complexity : O(n) - Extra hashmap space
  // Did this code successfully run on Leetcode : yes
  // Any problem you faced while coding this : no
  // Add all nodes to hashmap with respective index and then remove nth using hashmap.
  public ListNode removeNthFromEndUsingExtraSpace(ListNode head, int n) {
    if(head == null) return head;
    HashMap<Integer, ListNode> map = new HashMap<>();
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode curr = dummy;
    int counter = -1;

    while(curr != null){
        counter++;
        map.put(counter, curr);
        curr = curr.next;
    }

    int toRemove = counter - n + 1;
    if(map.size() > 1){
        map.get(toRemove - 1).next = map.get(toRemove).next;
    }else{
        return null;
    }

    return map.get(0).next;
}

  private static void printList(ListNode node){
      ListNode temp = node;
      while(temp != null){
        System.out.print(temp.val + "->");
        temp = temp.next;
      }

      System.out.print("\n");
    }

    public static ListNode removeNthFromEndUsingReverse(ListNode head, int n) {
      /*
        1. Reverse entire List
        2. remove nth item from reversed List
        3. Reverse list again to make it as original
      */
      System.out.println("====== Before 1st reverse ====== ");
      printList(head);
      ListNode curr = head;
      ListNode prev = null;
      ListNode temp = curr.next;

      while(curr != null){
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
      }

      ListNode reversedHead = prev;
      temp = prev;

      System.out.println("====== After 1st reverse ====== ");
      printList(reversedHead);

      // 2. remove nth item
      ListNode dummy = new ListNode(-1);
      dummy.next = reversedHead;
      temp = dummy;
      
      int counter = 0;
      while(counter != n){
        prev = temp;
        temp = temp.next;
        counter++;
      }

      prev.next = prev.next.next;

      System.out.println("====== After removal ====== ");
      printList(reversedHead);

      // 3. Reverse list again
      curr = reversedHead;
      prev = null;

      while(curr != null){
        temp      = curr.next;
        curr.next = prev;
        prev      = curr;
        curr      = temp;
      }

      System.out.println("====== Final list ====== ");
      printList(prev);
      return prev;

    }
  }
