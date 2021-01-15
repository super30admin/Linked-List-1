/*
TC: O(N)
SC:O(1)
 */

class ReverseLinkedList{

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) return head;
        ListNode reverseNode = reverseList(head.next);
        System.out.println(reverseNode.val);
        head.next.next = head;
        head.next = null;
        return reverseNode;
    }
}