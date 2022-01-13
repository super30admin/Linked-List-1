/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//TC: O(n)
//SC: O(1)

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = new ListNode();
        ListNode current = new ListNode();
        ListNode nextNode = new ListNode();
        if(head == null || head.next == null) return head;
        prev = null;
        current = head;
        nextNode = head.next;
        while(nextNode != null){
            current.next = prev;
            prev = current;
            current = nextNode;
            nextNode = nextNode.next;
        }
        current.next = prev;
        return current;
    }
}
