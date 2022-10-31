package s30.linkedList.linkedList1;

import s30.linkedList.ListNode;

import java.util.ArrayDeque;
import java.util.Queue;
//Iterative
// Time Complexity O(n) iterating through all nodes
// Space Complexity O(1)

// Recursive soln
// Time Complexity O(n)
// Space Complexity O(n) at most we have n recursive calls.
public class ReverseList {
    public static ListNode reverseListRec(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverseListRec(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;

    }

    private static ListNode reverseList(ListNode root) {
        ListNode prev = null;
        ListNode curr = root;

         while(curr != null){
             ListNode  temp = curr.next;
             curr.next = prev;
             prev = curr;
             curr = temp;
         }

         return prev;

    }
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        ListNode res = reverseList(root);
        System.out.println(res);

    }


}
