// Time Complexity :O(n) -> number of nodes
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//
// Your code here along with comments explaining your approach
// 1. create a new ListNode.
// 2. For each node in the given Linked List,create a new Node with same value of current node add it to the starting of new ListNode
// 3 . return the newly created node after pointing to the previously created LinkedList.
public class reverseLinkedList {
    private static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static ListNode reverseList(ListNode head) {
        ListNode rev = null;
        ListNode current = head;
        while(current!=null){
            ListNode temp = new ListNode(current.val);
            temp.next = rev;
            rev = temp;
            current = current.next;
        }
        return rev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode root = head;
        head.next = new ListNode(2);
        head = head.next;
        head = new ListNode(3);
        head = head.next;
        head = new ListNode(4);
        System.out.println(reverseList(root));
    }
}
