public class reverseLinkedList {
    //using iteration
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while(fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }

    //using recursion
    public ListNode reverseList(ListNode head) {
        //base condition
        if(head == null || head.next == null) return head;
        ListNode reversed = reverseList(head.next);
        //stack.pop() will happen and head will come out
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}