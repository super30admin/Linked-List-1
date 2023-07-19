class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        // ListNode prev = null;
        // ListNode slow = head;
        // ListNode fast = head.next;
        // while(fast!=null){
        //     slow.next = prev;
        //     prev = slow;
        //     slow = fast;
        //     fast = fast.next;
        // }
        // slow.next = prev;
        // return slow;

        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
}