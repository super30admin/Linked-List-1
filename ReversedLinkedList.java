//Time Complexity: O(n)
//Space Complexity: O(1)
public class ReversedLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode re = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return re;
    }
}
