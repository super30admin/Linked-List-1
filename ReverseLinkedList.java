public class ReverseLinkedList {
    ListNode reverse;
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode firstNode = head;
        helper(head);
        firstNode.next = null;
        return reverse;
    }
    
    // TC is O(n)
    // SC is O(n)
    private ListNode helper(ListNode head){
        if(head.next == null) return head;
        
        reverse = helper(head.next);
        head.next.next = head;
        return reverse;
    }
}
