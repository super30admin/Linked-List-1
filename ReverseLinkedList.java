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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverseLinkedList(head);

    }

    private ListNode reverseLinkedList(ListNode head){
        if(head==null || head.next== null){
            return head;
        }
        ListNode reversed = reverseLinkedList(head.next);
        System.out.println(reversed.val);
        head.next.next = head;
        head.next = null;
        return reversed;

    }
}
